package com.sc.mapper;

import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersMapper {
    int countByExample(SysUsersExample example);

    int deleteByExample(SysUsersExample example);

    int deleteByPrimaryKey(Long usersId);

    int insert(SysUsers record);

    int insertSelective(SysUsers record);

    List<SysUsers> selectByExample(SysUsersExample example);

    SysUsers selectByPrimaryKey(Long usersId);

    int updateByExampleSelective(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    int updateByExample(@Param("record") SysUsers record, @Param("example") SysUsersExample example);

    int updateByPrimaryKeySelective(SysUsers record);

    int updateByPrimaryKey(SysUsers record);
    
    public SysUsers selectPower(SysUsers user);
    
    public SysUsers selectRole(Long uId);
    
    public SysUsers selectUserinfo(Long uId);
    
    public List<SysUsers> selectNoRoleUser();
    
    public List<SysUsers> selectUserinfo2(SysUsers user);
}