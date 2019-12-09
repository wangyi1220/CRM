package com.sc.mapper;

import com.sc.entity.SaleSoutOrder;
import com.sc.entity.SaleSoutOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleSoutOrderMapper {
    int countByExample(SaleSoutOrderExample example);

    int deleteByExample(SaleSoutOrderExample example);

    int deleteByPrimaryKey(String sorderId);

    int insert(SaleSoutOrder record);

    int insertSelective(SaleSoutOrder record);

    List<SaleSoutOrder> selectByExample(SaleSoutOrderExample example);

    SaleSoutOrder selectByPrimaryKey(String sorderId);

    int updateByExampleSelective(@Param("record") SaleSoutOrder record, @Param("example") SaleSoutOrderExample example);

    int updateByExample(@Param("record") SaleSoutOrder record, @Param("example") SaleSoutOrderExample example);

    int updateByPrimaryKeySelective(SaleSoutOrder record);

    int updateByPrimaryKey(SaleSoutOrder record);
}