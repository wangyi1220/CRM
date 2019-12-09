package com.sc.mapper;

import com.sc.entity.SysUserinfo;
import com.sc.entity.SysUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserinfoMapper {
    int countByExample(SysUserinfoExample example);

    int deleteByExample(SysUserinfoExample example);

    int deleteByPrimaryKey(Long empId);

    int insert(SysUserinfo record);

    int insertSelective(SysUserinfo record);

    List<SysUserinfo> selectByExample(SysUserinfoExample example);

    SysUserinfo selectByPrimaryKey(Long empId);

    int updateByExampleSelective(@Param("record") SysUserinfo record, @Param("example") SysUserinfoExample example);

    int updateByExample(@Param("record") SysUserinfo record, @Param("example") SysUserinfoExample example);

    int updateByPrimaryKeySelective(SysUserinfo record);

    int updateByPrimaryKey(SysUserinfo record);
}