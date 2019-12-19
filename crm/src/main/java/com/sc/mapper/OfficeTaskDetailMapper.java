package com.sc.mapper;

import com.sc.entity.OfficeTaskDetail;
import com.sc.entity.OfficeTaskDetailExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeTaskDetailMapper {
    int countByExample(OfficeTaskDetailExample example);

    int deleteByExample(OfficeTaskDetailExample example);

    int deleteByPrimaryKey(BigDecimal taskDetailId);

    int insert(OfficeTaskDetail record);

    int insertSelective(OfficeTaskDetail record);

    List<OfficeTaskDetail> selectByExample(OfficeTaskDetailExample example);

    OfficeTaskDetail selectByPrimaryKey(BigDecimal taskDetailId);
    OfficeTaskDetail selectByTaskId(BigDecimal taskId);
    int updateByExampleSelective(@Param("record") OfficeTaskDetail record, @Param("example") OfficeTaskDetailExample example);

    int updateByExample(@Param("record") OfficeTaskDetail record, @Param("example") OfficeTaskDetailExample example);

    int updateByPrimaryKeySelective(OfficeTaskDetail record);

    int updateByPrimaryKey(OfficeTaskDetail record);
}