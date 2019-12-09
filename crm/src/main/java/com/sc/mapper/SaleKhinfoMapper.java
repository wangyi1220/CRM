package com.sc.mapper;

import com.sc.entity.SaleKhinfo;
import com.sc.entity.SaleKhinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleKhinfoMapper {
    int countByExample(SaleKhinfoExample example);

    int deleteByExample(SaleKhinfoExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(SaleKhinfo record);

    int insertSelective(SaleKhinfo record);

    List<SaleKhinfo> selectByExample(SaleKhinfoExample example);

    SaleKhinfo selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") SaleKhinfo record, @Param("example") SaleKhinfoExample example);

    int updateByExample(@Param("record") SaleKhinfo record, @Param("example") SaleKhinfoExample example);

    int updateByPrimaryKeySelective(SaleKhinfo record);

    int updateByPrimaryKey(SaleKhinfo record);
}