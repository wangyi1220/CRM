package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysUsersRole;
import com.sc.entity.SysUsersRoleExample;
import com.sc.entity.SysUsersRoleExample.Criteria;
import com.sc.mapper.SysUsersRoleMapper;
import com.sc.service.SysUsersRoleService;
@Service
public class SysUsersRoleServiceImpl implements SysUsersRoleService {
	
	@Autowired
	SysUsersRoleMapper sysUsersRoleMapper;
	
	@Override
	public void insert(SysUsersRole sur) {
		if(sur!=null){
			this.sysUsersRoleMapper.insert(sur);
		}
	}

	@Override
	public void update(SysUsersRole sur) {
		if(sur!=null){
			SysUsersRoleExample example = new SysUsersRoleExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsersIdEqualTo(sur.getUsersId());
			this.sysUsersRoleMapper.updateByExample(sur, example);
		}
	}

}
