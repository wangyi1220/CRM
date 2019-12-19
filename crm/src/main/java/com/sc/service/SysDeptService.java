package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDept;

public interface SysDeptService {
	// 分页查询
	public PageInfo<SysDept> select(Integer pageNum, Integer pageSize);

	// 增
	public void add(SysDept s);

	// 删
	public void del(SysDept s);

	// 改
	public void update(SysDept s);

	// 通过主键获取信息
	public SysDept get(Long deptId);
}
