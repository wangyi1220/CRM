package com.sc.mapper;

import com.sc.entity.SaleKhcontacts;
import com.sc.entity.SaleKhcontactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleKhcontactsMapper {
    int countByExample(SaleKhcontactsExample example);

    int deleteByExample(SaleKhcontactsExample example);

    int deleteByPrimaryKey(Long contactId);

    int insert(SaleKhcontacts record);

    int insertSelective(SaleKhcontacts record);

    List<SaleKhcontacts> selectByExample(SaleKhcontactsExample example);

    SaleKhcontacts selectByPrimaryKey(Long contactId);

    int updateByExampleSelective(@Param("record") SaleKhcontacts record, @Param("example") SaleKhcontactsExample example);

    int updateByExample(@Param("record") SaleKhcontacts record, @Param("example") SaleKhcontactsExample example);

    int updateByPrimaryKeySelective(SaleKhcontacts record);

    int updateByPrimaryKey(SaleKhcontacts record);
}