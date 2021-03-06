package com.sc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sc.entity.SaleSinfo;
import com.sc.entity.SaleSinfoExample;

public interface SaleSinfoMapper {
    int countByExample(SaleSinfoExample example);

    int deleteByExample(SaleSinfoExample example);

    int deleteByPrimaryKey(Long sorderInfoId);

    int insert(SaleSinfo record);

    int insertSelective(SaleSinfo record);

    List<SaleSinfo> selectByExample(SaleSinfoExample example);

    SaleSinfo selectByPrimaryKey(Long sorderInfoId);

    int updateByExampleSelective(@Param("record") SaleSinfo record, @Param("example") SaleSinfoExample example);

    int updateByExample(@Param("record") SaleSinfo record, @Param("example") SaleSinfoExample example);

    int updateByPrimaryKeySelective(SaleSinfo record);

    int updateByPrimaryKey(SaleSinfo record);
}