package com.sc.mapper;

import com.sc.entity.SaleKhloss;
import com.sc.entity.SaleKhlossExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleKhlossMapper {
    int countByExample(SaleKhlossExample example);

    int deleteByExample(SaleKhlossExample example);

    int deleteByPrimaryKey(Long khLossId);

    int insert(SaleKhloss record);

    int insertSelective(SaleKhloss record);

    List<SaleKhloss> selectByExample(SaleKhlossExample example);

    SaleKhloss selectByPrimaryKey(Long khLossId);

    int updateByExampleSelective(@Param("record") SaleKhloss record, @Param("example") SaleKhlossExample example);

    int updateByExample(@Param("record") SaleKhloss record, @Param("example") SaleKhlossExample example);

    int updateByPrimaryKeySelective(SaleKhloss record);

    int updateByPrimaryKey(SaleKhloss record);
}