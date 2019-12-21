package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysPowerinfoExample;
import com.sc.entity.SysPowerinfoExample.Criteria;
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
	
	//添加基本权限
	@Override
	public void addPower(SysPowerinfo spi) {
		if(spi!=null){
			this.sysPowerinfoMapper.insert(spi);
		}
		
	}

	@Override
	public SysPowerinfo selectBypUrl(String purl) {
		if(purl!=null){
			SysPowerinfoExample example = new SysPowerinfoExample();
			Criteria criteria = example.createCriteria();
			criteria.andPowerUrlEqualTo(purl);
			List<SysPowerinfo> list = this.sysPowerinfoMapper.selectByExample(example);
			return list.get(0);
		}
		return null;
	}

}
