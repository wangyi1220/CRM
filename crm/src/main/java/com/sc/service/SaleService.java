package com.sc.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SaleKhcontacts;
import com.sc.entity.SaleKhinfo;


public interface SaleService{
	
    //联系人
	public List<SaleKhcontacts>  lxcx(Long id);
	
	public PageInfo<SaleKhcontacts> lxselect(Integer pageNum,Integer pageSize);
    //客户信息
	public PageInfo<SaleKhinfo> select(Integer pageNum,Integer pageSize,SaleKhinfo s);
	//客户信息修改
	public void update(SaleKhinfo s);
	//客户信息添加
	public void add(SaleKhinfo s);
	
}