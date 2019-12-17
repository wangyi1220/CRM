package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPost;
import com.sc.entity.SysPostExample;
import com.sc.mapper.SysPostMapper;
import com.sc.service.SysPostService;

@Service
public class SysPostServiceImpl implements SysPostService {
	@Autowired
	SysPostMapper sysPostMapper;
	@Override
	public PageInfo<SysPost> select(Integer pageNum, Integer pageSize) {
         PageHelper.startPage(pageNum, pageSize);
         SysPostExample e=new SysPostExample();
         e.setOrderByClause("POST_ID DESC");
		List<SysPost> list = sysPostMapper.selectByExample(e);
		
		PageInfo<SysPost> pageInfo = new PageInfo<SysPost>(list);
		
		return pageInfo;
		
	}
	@Override
	public void add(SysPost s) {
		if (s != null){
			this.sysPostMapper.insert(s);
		}
		
	}
	@Override
	public void del(SysPost s) {
		if (s != null){
			this.sysPostMapper.deleteByPrimaryKey(s.getPostId());
		}
	}
	@Override
	public void update(SysPost s) {
		if (s != null&& s.getPostId()!=null){
			this.sysPostMapper.updateByPrimaryKey(s);
		}
	}
	@Override
	public SysPost get(Long postId) {
		if(postId!=null){
			return this.sysPostMapper.selectByPrimaryKey(postId);
		}
		return null;
	}

}
