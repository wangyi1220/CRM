package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysRole;
import com.sc.entity.SysRoleExample;
import com.sc.entity.SysRoleExample.Criteria;
import com.sc.entity.SysUsers;
import com.sc.mapper.SysRoleMapper;
import com.sc.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	SysRoleMapper sysRoleMapper;
	
	@Override
	public void addRole(SysRole sr) {
		if(sr!=null){
			this.sysRoleMapper.insert(sr);
		}
		
	}

	@Override
	public List<SysRole> selectAll() {
		List<SysRole> list = this.sysRoleMapper.selectByExample(null);
		return list;
	}

	@Override
	public List<SysRole> selectBySuperId(long sId) {
		SysRoleExample example = new SysRoleExample();
		Criteria criteria = example.createCriteria();
		criteria.andSuperRoleIdEqualTo(sId);
		List<SysRole> sonList = this.sysRoleMapper.selectByExample(example);
		return sonList;
	}

	@Override
	public SysRole selectByPK(long pk) {
		
			SysRole role = this.sysRoleMapper.selectByPrimaryKey(pk);
		    return role;
	}

	@Override
	public SysRole selectMeAndSuper(Long rId) {
		SysRole role = this.sysRoleMapper.selectMeAndSuper(rId);
		return role;
	}

	@Override
	public PageInfo<SysRole> selectUsers(Integer pageNum,Integer pageSize,Long rId) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysRole> list = this.sysRoleMapper.selectUsers(rId);
		PageInfo<SysRole> info = new PageInfo<SysRole>(list);
		return info;
	}

	@Override
	public PageInfo<SysUsers> selectUsersAndNORoleUser(Integer pageNum, Integer pageSize, Long rId) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysRole> list = this.sysRoleMapper.selectUsersAndInfos(22L);
		
		return null;
	}

}
