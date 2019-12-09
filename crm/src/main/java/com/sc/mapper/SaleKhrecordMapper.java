package com.sc.mapper;

import com.sc.entity.SaleKhrecord;
import com.sc.entity.SaleKhrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleKhrecordMapper {
    int countByExample(SaleKhrecordExample example);

    int deleteByExample(SaleKhrecordExample example);

    int deleteByPrimaryKey(Long contactRecordId);

    int insert(SaleKhrecord record);

    int insertSelective(SaleKhrecord record);

    List<SaleKhrecord> selectByExample(SaleKhrecordExample example);

    SaleKhrecord selectByPrimaryKey(Long contactRecordId);

    int updateByExampleSelective(@Param("record") SaleKhrecord record, @Param("example") SaleKhrecordExample example);

    int updateByExample(@Param("record") SaleKhrecord record, @Param("example") SaleKhrecordExample example);

    int updateByPrimaryKeySelective(SaleKhrecord record);

    int updateByPrimaryKey(SaleKhrecord record);
}