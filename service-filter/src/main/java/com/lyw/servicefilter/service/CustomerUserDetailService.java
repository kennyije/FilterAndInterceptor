package com.lyw.servicefilter.service;

import com.lyw.servicefilter.model.SysRole;
import com.lyw.servicefilter.model.SysUser;
import com.lyw.servicefilter.model.SysUserRoleKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userDetailsService")
public class CustomerUserDetailService implements UserDetailsService {
    @Autowired
    private SysUserService userService;

    @Autowired
    private SysRoleService roleService;

    @Autowired
    private SysUserRoleService userRoleService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //从数据库取用户
        SysUser sysUser = userService.selectByName(s);
        //判断用户是否存在
        if(sysUser == null ) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        //添加权限
        List<SysUserRoleKey> userRoles = userRoleService.listByUserId(sysUser.getId());
        for(SysUserRoleKey userRole: userRoles) {
            SysRole role = roleService.selectById(userRole.getRoleId());
            ((ArrayList<GrantedAuthority>) authorities).add(new SimpleGrantedAuthority(role.getName()));
        }

        return new User(sysUser.getName(), sysUser.getPassword(), authorities);
    }
}
