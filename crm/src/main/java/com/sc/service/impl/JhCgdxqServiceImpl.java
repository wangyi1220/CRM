package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.entity.JhCgdxqExample;
import com.sc.entity.JhCgdxqExample.Criteria;
import com.sc.mapper.JhCgdxqMapper;
import com.sc.service.JhCgdxqService;

@Service
public class JhCgdxqServiceImpl implements JhCgdxqService {

	@Autowired
	JhCgdxqMapper jhCgdxqMapper;

	@Override
	public void add(JhCgdxq cgdxq) {
		// TODO Auto-generated method stub
		jhCgdxqMapper.insert(cgdxq);
	}

	@Override
	public PageInfo<JhCgdxq> selectpage(Long cgdId, Integer pageNum, Integer pageSize) {

		PageHelper.startPage(pageNum, pageSize);
		
		JhCgdxqExample e = new JhCgdxqExample();
		Criteria c = e.createCriteria();
		c.andCgdIdEqualTo(cgdId);
		List<JhCgdxq> list = this.jhCgdxqMapper.selectByExample(e);

		PageInfo<JhCgdxq> page=new PageInfo<JhCgdxq>(list);
		
		return page;
	}

}
