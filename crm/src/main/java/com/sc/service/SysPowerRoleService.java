package com.sc.service;

import java.util.List;

import com.sc.entity.SysPowerRole;

public interface SysPowerRoleService {
	public List<SysPowerRole> selectByrId(Long rId);
	public void delete(SysPowerRole spr);
	public void insert(SysPowerRole spr);
	public void deleteByrId(Long rId);
}
