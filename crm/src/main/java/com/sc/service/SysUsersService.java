package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;

public interface SysUsersService {
	
	
	
	public PageInfo<SysUsers> select(Integer pageNum,Integer pageSize);
}
