package com.sc.mapper;

import com.sc.entity.OffMessdeta;
import com.sc.entity.OffMessdetaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffMessdetaMapper {
    int countByExample(OffMessdetaExample example);

    int deleteByExample(OffMessdetaExample example);

    int deleteByPrimaryKey(Long detailsid);

    int insert(OffMessdeta record);

    int insertSelective(OffMessdeta record);

    List<OffMessdeta> selectByExample(OffMessdetaExample example);

    OffMessdeta selectByPrimaryKey(Long detailsid);

    int updateByExampleSelective(@Param("record") OffMessdeta record, @Param("example") OffMessdetaExample example);

    int updateByExample(@Param("record") OffMessdeta record, @Param("example") OffMessdetaExample example);

    int updateByPrimaryKeySelective(OffMessdeta record);

    int updateByPrimaryKey(OffMessdeta record);
}