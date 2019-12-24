package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysCompanyinfo;
import com.sc.entity.SysUserinfo;

public interface SysCompanyInfoService {
	//分页查询
	public PageInfo<SysCompanyinfo> select(Integer pageNum,Integer pageSize);
	//增
	public void add(SysCompanyinfo s);
	//删
	public void del(SysCompanyinfo s);
	//改
	public void update(SysCompanyinfo s);
	//通过主键获取信息
	public SysCompanyinfo get(Long pk);
	//查，不分页
	public List<SysCompanyinfo> selectlist();
}
