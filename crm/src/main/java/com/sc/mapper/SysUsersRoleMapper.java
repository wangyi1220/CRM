package com.sc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sc.entity.SysUsersRole;
import com.sc.entity.SysUsersRoleExample;

public interface SysUsersRoleMapper {
    int countByExample(SysUsersRoleExample example);

    int deleteByExample(SysUsersRoleExample example);

    int deleteByPrimaryKey(Long surId);

    int insert(SysUsersRole record);

    int insertSelective(SysUsersRole record);

    List<SysUsersRole> selectByExample(SysUsersRoleExample example);

    SysUsersRole selectByPrimaryKey(Long surId);

    int updateByExampleSelective(@Param("record") SysUsersRole record, @Param("example") SysUsersRoleExample example);

    int updateByExample(@Param("record") SysUsersRole record, @Param("example") SysUsersRoleExample example);

    int updateByPrimaryKeySelective(SysUsersRole record);

    int updateByPrimaryKey(SysUsersRole record);
}