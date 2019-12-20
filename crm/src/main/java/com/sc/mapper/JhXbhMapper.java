package com.sc.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sc.entity.JhXbh;
import com.sc.entity.JhXbhExample;

public interface JhXbhMapper {
    int countByExample(JhXbhExample example);

    int deleteByExample(JhXbhExample example);

    int deleteByPrimaryKey(BigDecimal xbhId);

    int insert(JhXbh record);

    int insertSelective(JhXbh record);

    List<JhXbh> selectByExample(JhXbhExample example);

    JhXbh selectByPrimaryKey(BigDecimal xbhId);

    int updateByExampleSelective(@Param("record") JhXbh record, @Param("example") JhXbhExample example);

    int updateByExample(@Param("record") JhXbh record, @Param("example") JhXbhExample example);

    int updateByPrimaryKeySelective(JhXbh record);

    int updateByPrimaryKey(JhXbh record);
}