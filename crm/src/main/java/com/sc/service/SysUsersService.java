package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;

public interface SysUsersService {	
	//²é
	public PageInfo<SysUsers> select(Integer pageNum,Integer pageSize);
	//¸Ä
	public void update(SysUsers s);
	
	public SysUsers selectPower();
	
	public SysUsers selectRole(Long uId);
	
	public SysUsers selectUserinfo(Long uId);
}
