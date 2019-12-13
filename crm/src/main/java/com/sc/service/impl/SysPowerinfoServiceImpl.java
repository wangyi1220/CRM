package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerinfo;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.service.SysPowerinfoService;

@Service
public class SysPowerinfoServiceImpl implements SysPowerinfoService {

	@Autowired
	SysPowerinfoMapper sysPowerinfoMapper;
	
	@Override
	public PageInfo<SysPowerinfo> selectList(Integer pageNum,Integer pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		
		List<SysPowerinfo> list = this.sysPowerinfoMapper.selectByExample(null);
		
		
		return null;
	}

}
