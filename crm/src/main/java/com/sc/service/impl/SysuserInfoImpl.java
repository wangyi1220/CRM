package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUserinfo;
import com.sc.mapper.SysUserinfoMapper;
import com.sc.service.SysUsersInfoService;

@Service
public class SysuserInfoImpl implements SysUsersInfoService {
	
	@Autowired
	SysUserinfoMapper sysUserinfoMapper;
	@Override
	public PageInfo<SysUserinfo> select(Integer pageNum, Integer pageSize) {

		PageHelper.startPage(pageNum, pageSize);
		
		List<SysUserinfo> list = sysUserinfoMapper.selectByExample(null);
		
		PageInfo<SysUserinfo> pageInfo = new PageInfo<SysUserinfo>(list);
		
		return pageInfo;
	}
	@Override
	public void update(SysUserinfo info) {
		if (info != null && info.getEmpId() != null) {
			this.sysUserinfoMapper.updateByPrimaryKey(info);
		}
		
	}
	@Override
	public SysUserinfo get(Long empId) {
		if (empId != null) {
			return this.sysUserinfoMapper.selectByPrimaryKey(empId);
		}
		return null;
	}
}
