package com.sc.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysLog;
import com.sc.entity.SysLogExample;
import com.sc.entity.SysLogExample.Criteria;
import com.sc.entity.SysUsers;
import com.sc.mapper.SysLogMapper;
import com.sc.service.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {

	@Autowired
	SysLogMapper sysLogMapper;
	@Autowired
	HttpSession session;
	
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
		example.setOrderByClause("VISIT_DATE DESC");
		Criteria criteria = example.createCriteria();
		if(log.getUserId()==null&&log.getVisitDate()==null){
			list=this.sysLogMapper.selectByExample(example);
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
		SysUsers user = (SysUsers)this.session.getAttribute("nowuser");
		System.out.println("µÇÂ½ÕßÐÅÏ¢£º"+user.toString());
		if(lId!=null){
			this.sysLogMapper.deleteByPrimaryKey(lId);
		}
		
	}

	@Override
	public void deleteAll() {
		this.sysLogMapper.deleteByExample(null);
	}

}
