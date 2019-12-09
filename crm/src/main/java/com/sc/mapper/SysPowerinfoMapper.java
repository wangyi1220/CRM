package com.sc.mapper;

import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysPowerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPowerinfoMapper {
    int countByExample(SysPowerinfoExample example);

    int deleteByExample(SysPowerinfoExample example);

    int deleteByPrimaryKey(Long powerId);

    int insert(SysPowerinfo record);

    int insertSelective(SysPowerinfo record);

    List<SysPowerinfo> selectByExample(SysPowerinfoExample example);

    SysPowerinfo selectByPrimaryKey(Long powerId);

    int updateByExampleSelective(@Param("record") SysPowerinfo record, @Param("example") SysPowerinfoExample example);

    int updateByExample(@Param("record") SysPowerinfo record, @Param("example") SysPowerinfoExample example);

    int updateByPrimaryKeySelective(SysPowerinfo record);

    int updateByPrimaryKey(SysPowerinfo record);
}