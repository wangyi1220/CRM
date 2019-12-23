package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysLog;
import com.sc.entity.SysLogExample;
import com.sc.entity.SysLogExample.Criteria;
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

	@Override
	public PageInfo<SysLog> selectPage(Integer pageNum,Integer pageSize,SysLog log) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysLog> list=null;
		SysLogExample example = new SysLogExample();
		Criteria criteria = example.createCriteria();
		if(log.getUserId()==null&&log.getVisitDate()==null){
			list=this.sysLogMapper.selectByExample(null);
		}else{
			if(log.getUserId()!=null){
				criteria.andUserIdEqualTo(log.getUserId());
			}
			if(log.getVisitDate()!=null){
				criteria.andVisitDateEqualTo(log.getVisitDate());
			}
			list=this.sysLogMapper.selectByExample(example);
		}
		
		PageInfo<SysLog> info = new PageInfo<SysLog>(list);
		return info;
	}

	@Override
	public void deleteLog(Long lId) {
		if(lId!=null){
			this.sysLogMapper.deleteByPrimaryKey(lId);
		}
		
	}

}
