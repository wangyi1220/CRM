package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPost;

public interface SysPostService {
	public PageInfo<SysPost> select(Integer pageNum,Integer pageSize);
}
