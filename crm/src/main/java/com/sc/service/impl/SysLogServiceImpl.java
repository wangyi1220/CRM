package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysLog;
import com.sc.mapper.SysLogMapper;
import com.sc.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	SysLogMapper sysLogMapper;
	
	@Override
	public void insert(SysLog log) {
		if(log!=null){
			this.sysLogMapper.insert(log);
		}
	}

}
