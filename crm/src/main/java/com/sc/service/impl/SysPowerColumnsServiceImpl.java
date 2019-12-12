package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysPowerColumns;
import com.sc.mapper.SysPowerColumnsMapper;
import com.sc.service.SysPowerColumnsService;

@Service
public class SysPowerColumnsServiceImpl implements SysPowerColumnsService {

	@Autowired
	SysPowerColumnsMapper  sysPowerColumnsMapper;
	
	@Override
	public void addSysPowerColumns(SysPowerColumns spc) {
		
		

	}

}
