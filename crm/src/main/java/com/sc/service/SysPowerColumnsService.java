package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysPowerinfo;

public interface SysPowerColumnsService {
	
	public void addSysPowerColumns(SysPowerColumns spc);
	
	public PageInfo<SysPowerColumns> selectList(Integer pageNum,Integer pageSize);
	
}
