package com.sc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sc.entity.SysPowerRole;
import com.sc.entity.SysPowerRoleExample;

public interface SysPowerRoleMapper {
    int countByExample(SysPowerRoleExample example);

    int deleteByExample(SysPowerRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysPowerRole record);

    int insertSelective(SysPowerRole record);

    List<SysPowerRole> selectByExample(SysPowerRoleExample example);

    SysPowerRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPowerRole record, @Param("example") SysPowerRoleExample example);

    int updateByExample(@Param("record") SysPowerRole record, @Param("example") SysPowerRoleExample example);

    int updateByPrimaryKeySelective(SysPowerRole record);

    int updateByPrimaryKey(SysPowerRole record);
}