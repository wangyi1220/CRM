package com.sc.mapper;

import com.sc.entity.SysCompanyinfo;
import com.sc.entity.SysCompanyinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCompanyinfoMapper {
    int countByExample(SysCompanyinfoExample example);

    int deleteByExample(SysCompanyinfoExample example);

    int deleteByPrimaryKey(Long pk);

    int insert(SysCompanyinfo record);

    int insertSelective(SysCompanyinfo record);

    List<SysCompanyinfo> selectByExample(SysCompanyinfoExample example);

    SysCompanyinfo selectByPrimaryKey(Long pk);

    int updateByExampleSelective(@Param("record") SysCompanyinfo record, @Param("example") SysCompanyinfoExample example);

    int updateByExample(@Param("record") SysCompanyinfo record, @Param("example") SysCompanyinfoExample example);

    int updateByPrimaryKeySelective(SysCompanyinfo record);

    int updateByPrimaryKey(SysCompanyinfo record);
}