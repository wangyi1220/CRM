package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;
import com.sc.entity.SysUsersExample.Criteria;
import com.sc.mapper.SysUsersMapper;
import com.sc.service.SysUsersService;

@Service
public class SysUsersServiceImpl implements SysUsersService {
	
	@Autowired
	SysUsersMapper sysUsersMapper;
	
	@Override
	public PageInfo<SysUsers> select(Integer pageNum, Integer pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		
		List<SysUsers> list = sysUsersMapper.selectByExample(null);
		
		PageInfo<SysUsers> pageInfo = new PageInfo<SysUsers>(list);
		
		return pageInfo;
	}

	@Override
	public void update(SysUsers s) {
		if (s != null && s.getUsersId()!= null) {
			
			this.sysUsersMapper.updateByPrimaryKey(s);
		
	}

}

	@Override
	public SysUsers selectPower() {
		
		
			SysUsers sysUsers = new SysUsers();
			sysUsers.setUsersId(61L);
			SysUsers users = this.sysUsersMapper.selectPower(sysUsers);
			return users;
		
	}

	@Override
	public SysUsers selectRole(Long uId) {
		SysUsers users = this.sysUsersMapper.selectRole(uId);
		return users;
	}

	@Override
	public SysUsers selectUserinfo(Long uId) {
		SysUsers users = this.sysUsersMapper.selectUserinfo(uId);
		return users;
	}

	@Override
	public List<SysUsers> selectAllNOSelf(Long uId) {
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsersIdNotEqualTo(uId);
		List<SysUsers> list = this.sysUsersMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<SysUsers> selectNoRoleUser() {
		List<SysUsers> list = this.sysUsersMapper.selectNoRoleUser();
		return list;
	}

	@Override
	public PageInfo<SysUsers> selectUserinfo2(Integer pageNum,Integer pageSize,SysUsers user) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysUsers> list = this.sysUsersMapper.selectUserinfo2(user);
		PageInfo<SysUsers> info = new PageInfo<SysUsers>(list);
		return info;
	}

	@Override
	public void deleteUser(SysUsers user) {
		if(user!=null){
			this.sysUsersMapper.deleteByPrimaryKey(user.getUsersId());
		}
	}

	@Override
	public SysUsers login(SysUsers user) {
		if(user!=null){
			SysUsersExample example = new SysUsersExample();
			Criteria criteria = example.createCriteria();
			criteria.andUsersNameEqualTo(user.getUsersName());
			List<SysUsers> list = this.sysUsersMapper.selectByExample(example);
			return list.get(0);
		}else{
			return null;
		}
		
	}
}
