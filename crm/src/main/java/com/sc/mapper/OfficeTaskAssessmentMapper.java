package com.sc.mapper;

import com.sc.entity.OfficeTaskAssessment;
import com.sc.entity.OfficeTaskAssessmentExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeTaskAssessmentMapper {
    int countByExample(OfficeTaskAssessmentExample example);

    int deleteByExample(OfficeTaskAssessmentExample example);

    int deleteByPrimaryKey(BigDecimal taskId);

    int insert(OfficeTaskAssessment record);

    int insertSelective(OfficeTaskAssessment record);

    List<OfficeTaskAssessment> selectByExample(OfficeTaskAssessmentExample example);

    OfficeTaskAssessment selectByPrimaryKey(BigDecimal taskId);

    int updateByExampleSelective(@Param("record") OfficeTaskAssessment record, @Param("example") OfficeTaskAssessmentExample example);

    int updateByExample(@Param("record") OfficeTaskAssessment record, @Param("example") OfficeTaskAssessmentExample example);

    int updateByPrimaryKeySelective(OfficeTaskAssessment record);

    int updateByPrimaryKey(OfficeTaskAssessment record);
}