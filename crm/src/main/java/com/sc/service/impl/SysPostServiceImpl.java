package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPost;
import com.sc.mapper.SysPostMapper;
import com.sc.service.SysPostService;

@Service
public class SysPostServiceImpl implements SysPostService {
	@Autowired
	SysPostMapper sysPostMapper;
	@Override
	public PageInfo<SysPost> select(Integer pageNum, Integer pageSize) {
PageHelper.startPage(pageNum, pageSize);
		
		List<SysPost> list = sysPostMapper.selectByExample(null);
		
		PageInfo<SysPost> pageInfo = new PageInfo<SysPost>(list);
		
		return pageInfo;
		
	}

}
