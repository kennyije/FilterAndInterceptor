package com.lyw.servicefilter.service;

import com.lyw.servicefilter.mapper.SysRoleMapper;
import com.lyw.servicefilter.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}
