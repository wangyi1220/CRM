package com.sc.service.impl;

import java.util.List;

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
			this.sysUsersRoleMapper.updateByPrimaryKey(sur);
		}
	}

	@Override
	public SysUsersRole selectByUId(Long uId) {
		SysUsersRoleExample example = new SysUsersRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsersIdEqualTo(uId);
		List<SysUsersRole> list = this.sysUsersRoleMapper.selectByExample(example);
		return list.get(0);
	}

	@Override
	public void deleteByrId(Long rId) {
		if(rId!=null){
			SysUsersRoleExample example = new SysUsersRoleExample();
			Criteria criteria = example.createCriteria();
			criteria.andRoleIdEqualTo(rId);
			this.sysUsersRoleMapper.deleteByExample(example);
		}
	}

	@Override
	public List<SysUsersRole> selectByrId(Long rId) {
		SysUsersRoleExample example = new SysUsersRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleIdEqualTo(rId);
		List<SysUsersRole> list = this.sysUsersRoleMapper.selectByExample(example);
		return list;
	}

	@Override
	public void deleteByuId(Long uId) {
		if(uId!=null){
			SysUsersRoleExample example = new SysUsersRoleExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsersIdEqualTo(uId);
			this.sysUsersRoleMapper.deleteByExample(example);
		}
	}

}
