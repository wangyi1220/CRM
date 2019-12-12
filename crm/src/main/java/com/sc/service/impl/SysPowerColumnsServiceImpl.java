package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysPowerinfo;
import com.sc.mapper.SysPowerColumnsMapper;
import com.sc.service.SysPowerColumnsService;

@Service
public class SysPowerColumnsServiceImpl implements SysPowerColumnsService {

	@Autowired
	SysPowerColumnsMapper  sysPowerColumnsMapper;
	
	@Override
	public void addSysPowerColumns(SysPowerColumns spc) {
		
		this.sysPowerColumnsMapper.insert(spc);
	}

	@Override
	public PageInfo<SysPowerColumns> selectList(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysPowerColumns> list = this.sysPowerColumnsMapper.selectPowerinfo();
		PageInfo<SysPowerColumns> pageInfo = new PageInfo<SysPowerColumns>(list);
		
		return pageInfo;
	}

}
