package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysRole;
import com.sc.entity.SysUsers;

public interface SysRoleService {
	public void addRole(SysRole sr);
	public List<SysRole> selectAll();
	public List<SysRole> selectBySuperId(long sId);
	public SysRole selectByPK(long pk);
	public SysRole selectMeAndSuper(Long rId);
	public PageInfo<SysRole> selectUsers(Integer pageNum,Integer pageSize,Long rId);
	public PageInfo<SysUsers> selectUsersAndNORoleUser(Integer pageNum,Integer pageSize,Long rId);
	public List<SysPowerColumns> selectRolePower(Long rId);
}
