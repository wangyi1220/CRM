package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysPowerRole;
import com.sc.entity.SysPowerRoleExample;
import com.sc.entity.SysPowerRoleExample.Criteria;
import com.sc.mapper.SysPowerRoleMapper;
import com.sc.service.SysPowerRoleService;

@Service
public class SysPowerRoleServiceImpl implements SysPowerRoleService {

	@Autowired
	SysPowerRoleMapper sysPowerRoleMapper;
	
	@Override
	public List<SysPowerRole> selectByrId(Long rId) {
		SysPowerRoleExample example = new SysPowerRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(rId);
		List<SysPowerRole> list = this.sysPowerRoleMapper.selectByExample(example);
		return list;
	}

	@Override
	public void delete(SysPowerRole spr) {
		this.sysPowerRoleMapper.deleteByPrimaryKey(spr.getId());
	}

	@Override
	public void insert(SysPowerRole spr) {
		if(spr!=null){
			this.sysPowerRoleMapper.insert(spr);
		}
		
	}

}
