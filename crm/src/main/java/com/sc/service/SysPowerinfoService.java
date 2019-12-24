package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerinfo;

public interface SysPowerinfoService {

	public PageInfo<SysPowerinfo> selectList(Integer pageNum,Integer pageSize);
	
	public void addPower(SysPowerinfo spi);
	
	public SysPowerinfo selectBypUrl(String purl);
	
	public List<SysPowerinfo> selectAll();
	
}
