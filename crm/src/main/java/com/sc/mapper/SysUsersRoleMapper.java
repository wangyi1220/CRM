package com.sc.mapper;

import com.sc.entity.SysUsersRole;
import com.sc.entity.SysUsersRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersRoleMapper {
    int countByExample(SysUsersRoleExample example);

    int deleteByExample(SysUsersRoleExample example);

    int insert(SysUsersRole record);

    int insertSelective(SysUsersRole record);

    List<SysUsersRole> selectByExample(SysUsersRoleExample example);

    int updateByExampleSelective(@Param("record") SysUsersRole record, @Param("example") SysUsersRoleExample example);

    int updateByExample(@Param("record") SysUsersRole record, @Param("example") SysUsersRoleExample example);
}