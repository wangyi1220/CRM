package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
public interface JhCgdxqService {
	
			//分页查询
			public PageInfo<JhCgdxq> selectpage(Long cgdId,Integer pageNum,Integer pageSize);
			//添加
			public void add(JhCgdxq cgdxq);
	
}
