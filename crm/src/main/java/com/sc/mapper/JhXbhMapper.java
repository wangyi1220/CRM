package com.sc.mapper;

import com.sc.entity.JhXbh;
import com.sc.entity.JhXbhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JhXbhMapper {
    int countByExample(JhXbhExample example);

    int deleteByExample(JhXbhExample example);

    int insert(JhXbh record);

    int insertSelective(JhXbh record);

    List<JhXbh> selectByExample(JhXbhExample example);

    int updateByExampleSelective(@Param("record") JhXbh record, @Param("example") JhXbhExample example);

    int updateByExample(@Param("record") JhXbh record, @Param("example") JhXbhExample example);
}