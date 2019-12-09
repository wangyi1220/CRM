package com.sc.mapper;

import com.sc.entity.KcCangku;
import com.sc.entity.KcCangkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcCangkuMapper {
    int countByExample(KcCangkuExample example);

    int deleteByExample(KcCangkuExample example);

    int deleteByPrimaryKey(String cangkuId);

    int insert(KcCangku record);

    int insertSelective(KcCangku record);

    List<KcCangku> selectByExample(KcCangkuExample example);

    KcCangku selectByPrimaryKey(String cangkuId);

    int updateByExampleSelective(@Param("record") KcCangku record, @Param("example") KcCangkuExample example);

    int updateByExample(@Param("record") KcCangku record, @Param("example") KcCangkuExample example);

    int updateByPrimaryKeySelective(KcCangku record);

    int updateByPrimaryKey(KcCangku record);
}