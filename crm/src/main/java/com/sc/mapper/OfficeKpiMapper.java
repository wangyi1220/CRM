package com.sc.mapper;

import com.sc.entity.OfficeKpi;
import com.sc.entity.OfficeKpiExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeKpiMapper {
    int countByExample(OfficeKpiExample example);

    int deleteByExample(OfficeKpiExample example);

    int deleteByPrimaryKey(BigDecimal kpiId);

    int insert(OfficeKpi record);

    int insertSelective(OfficeKpi record);

    List<OfficeKpi> selectByExample(OfficeKpiExample example);

    OfficeKpi selectByPrimaryKey(BigDecimal kpiId);

    int updateByExampleSelective(@Param("record") OfficeKpi record, @Param("example") OfficeKpiExample example);

    int updateByExample(@Param("record") OfficeKpi record, @Param("example") OfficeKpiExample example);

    int updateByPrimaryKeySelective(OfficeKpi record);

    int updateByPrimaryKey(OfficeKpi record);
}