package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPost;

public interface SysPostService {
	//分页查询
	public PageInfo<SysPost> select(Integer pageNum,Integer pageSize);
	//增
	public void add(SysPost s);
	//删
	public void del(SysPost s);
	//改
	public void update(SysPost s);
	//通过主键获取信息
	public SysPost get(Long postId);
}
