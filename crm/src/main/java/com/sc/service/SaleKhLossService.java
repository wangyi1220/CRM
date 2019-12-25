package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SaleKhinfo;
import com.sc.entity.SaleKhloss;

public interface SaleKhLossService {
	
	public PageInfo<SaleKhloss> lossselect(Integer pageNum,Integer pageSize,SaleKhloss l);
	
	public void lossupdate(SaleKhloss l);
	
	public void lossdelete(Long lossid);
	
	public SaleKhinfo idselect(Long id);
	
	public void losshuifu(SaleKhinfo s);
	
	

}
