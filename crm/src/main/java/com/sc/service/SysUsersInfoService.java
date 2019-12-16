package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUserinfo;

public interface SysUsersInfoService {
	//查
	public PageInfo<SysUserinfo> select(Integer pageNum,Integer pageSize);
	//改
	public void update(SysUserinfo info);
	//获取对象
	public SysUserinfo get(Long empId);
}
