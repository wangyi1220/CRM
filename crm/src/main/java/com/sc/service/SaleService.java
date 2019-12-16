package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.SaleKhcontacts;
import com.sc.entity.SaleKhinfo;

public interface SaleService{
	
    //联系人
	public PageInfo<SaleKhcontacts> lxselect(Integer pageNum,Integer pageSize);
    //客户信息
	public PageInfo<SaleKhinfo> select(Integer pageNum,Integer pageSize,SaleKhinfo s);
	
}