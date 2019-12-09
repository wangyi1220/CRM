package com.sc.mapper;

import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysPowerColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPowerColumnsMapper {
    int countByExample(SysPowerColumnsExample example);

    int deleteByExample(SysPowerColumnsExample example);

    int deleteByPrimaryKey(Long columnsId);

    int insert(SysPowerColumns record);

    int insertSelective(SysPowerColumns record);

    List<SysPowerColumns> selectByExample(SysPowerColumnsExample example);

    SysPowerColumns selectByPrimaryKey(Long columnsId);

    int updateByExampleSelective(@Param("record") SysPowerColumns record, @Param("example") SysPowerColumnsExample example);

    int updateByExample(@Param("record") SysPowerColumns record, @Param("example") SysPowerColumnsExample example);

    int updateByPrimaryKeySelective(SysPowerColumns record);

    int updateByPrimaryKey(SysPowerColumns record);
}