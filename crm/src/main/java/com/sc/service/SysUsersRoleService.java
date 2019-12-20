package com.sc.service;

import com.sc.entity.SysUsersRole;

public interface SysUsersRoleService {
	public void insert(SysUsersRole sur);
	public void update(SysUsersRole sur);
	public SysUsersRole selectByUId(Long uId);
	public void deleteByrId(Long rId);
}
