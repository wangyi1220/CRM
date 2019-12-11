package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.mapper.OffMessMapper;
import com.sc.service.OffMessService;

@Service
public class OffMessServiceimpl implements OffMessService {

	@Autowired
	OffMessMapper offMessMapper;
	
	@Override
	public void add(OffMess m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(OffMess m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(OffMess m) {
		// TODO Auto-generated method stub

	}

	@Override
	public OffMess get(OffMess m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OffMess> select() {
		// TODO Auto-generated method stub
		return this.offMessMapper.selectByExample(null);
	}

	@Override
	public PageInfo<OffMess> selectpage(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
