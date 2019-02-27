package com.lyw.servicefilter.service;

import com.lyw.servicefilter.mapper.SysUserRoleMapper;
import com.lyw.servicefilter.model.SysUserRoleKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @Autowired
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRoleKey> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}
