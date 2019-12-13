package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysPowerRole;
import com.sc.entity.SysPowerRoleExample;
import com.sc.entity.SysPowerRoleExample.Criteria;
import com.sc.mapper.SysPowerRoleMapper;

import SysPowerRoleMapper.SysPowerRoleService;

@Service
public class SysPowerRoleServiceImpl implements SysPowerRoleService {

	@Autowired
	SysPowerRoleMapper sysPowerRoleMapper;
	
	@Override
	public List<SysPowerRole> selectByRid(BigDecimal rId) {
		if(rId==null){
			return null;
		}else{
			SysPowerRoleExample example = new SysPowerRoleExample();
			Criteria criteria = example.createCriteria();
			criteria.andRoleIdEqualTo(rId);
			List<SysPowerRole> list = this.sysPowerRoleMapper.selectByExample(example);
			
			return list;
		}
	}

}
