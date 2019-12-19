package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysCompanyinfo;

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
}
