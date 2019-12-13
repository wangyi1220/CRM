package com.sc.service;


import com.github.pagehelper.PageInfo;
import com.sc.entity.SaleKhinfo;

public interface SaleService{
	

	public PageInfo<SaleKhinfo> select(Integer pageNum,Integer pageSize);

	public PageInfo<SaleKhinfo> select(Integer pageNum,Integer pageSize,SaleKhinfo s);
	
}