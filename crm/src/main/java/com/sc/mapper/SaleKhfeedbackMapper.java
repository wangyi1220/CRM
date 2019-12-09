package com.sc.mapper;

import com.sc.entity.SaleKhfeedback;
import com.sc.entity.SaleKhfeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleKhfeedbackMapper {
    int countByExample(SaleKhfeedbackExample example);

    int deleteByExample(SaleKhfeedbackExample example);

    int deleteByPrimaryKey(Long feedbackRecorId);

    int insert(SaleKhfeedback record);

    int insertSelective(SaleKhfeedback record);

    List<SaleKhfeedback> selectByExample(SaleKhfeedbackExample example);

    SaleKhfeedback selectByPrimaryKey(Long feedbackRecorId);

    int updateByExampleSelective(@Param("record") SaleKhfeedback record, @Param("example") SaleKhfeedbackExample example);

    int updateByExample(@Param("record") SaleKhfeedback record, @Param("example") SaleKhfeedbackExample example);

    int updateByPrimaryKeySelective(SaleKhfeedback record);

    int updateByPrimaryKey(SaleKhfeedback record);
}