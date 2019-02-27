package com.lyw.servicefilter.mapper;

import com.lyw.servicefilter.model.SysUserRoleKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface SysUserRoleMapper {
    int deleteByPrimaryKey(SysUserRoleKey key);

    int insert(SysUserRoleKey record);

    int insertSelective(SysUserRoleKey record);

    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRoleKey> listByUserId(Integer userId);
}