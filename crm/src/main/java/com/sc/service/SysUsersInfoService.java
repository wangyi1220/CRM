package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUserinfo;

public interface SysUsersInfoService {
	//查 分页
	public PageInfo<SysUserinfo> select(Integer pageNum,Integer pageSize);
	//改
	public void update(SysUserinfo info);
	//获取对象
	public SysUserinfo get(Long empId);
	//删
    public void delete(SysUserinfo s);
    //增加
    public void add(SysUserinfo s);
    //查 
    public List<SysUserinfo> selectlist();
}
