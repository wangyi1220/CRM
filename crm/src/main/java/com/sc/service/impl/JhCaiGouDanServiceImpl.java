package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdExample;
import com.sc.entity.JhCgdExample.Criteria;
import com.sc.mapper.JhCgdMapper;
import com.sc.service.JhCgdService;
@Service
public class JhCaiGouDanServiceImpl implements JhCgdService {


@Autowired
JhCgdMapper  JhCgdMapper;


	@Override
	public void add(JhCgd cgd) {
		// TODO Auto-generated method stub
		JhCgdMapper.insert(cgd);
	}

	@Override
	public void update(JhCgd cgd) {
		// TODO Auto-generated method stub
		JhCgdMapper.updateByPrimaryKey(cgd);
	}



	@Override
	public List<JhCgd> list() {
		// TODO Auto-generated method stub
		return JhCgdMapper.selectByExample(null);
	}

	@Override
	public void delete(Long cgdId) {
		// TODO Auto-generated method stub
		JhCgdMapper.deleteByPrimaryKey(cgdId);
	}

	@Override
	public JhCgd get(Long cgdId) {
		// TODO Auto-generated method stub
		return JhCgdMapper.selectByPrimaryKey(cgdId);
	}
	

	@Override
	public PageInfo<JhCgd> selectpage(Integer pageNum, Integer pageSize) {

		
		PageHelper.startPage(pageNum, pageSize);
		

		List<JhCgd> list = this.JhCgdMapper.selectByExample(null);

		PageInfo<JhCgd> page=new PageInfo<JhCgd>(list);
		
		return page;
	}
	//模糊查询
	@Override
	public List<JhCgd> searchByName(String textData) {
		         JhCgdExample e = new JhCgdExample();
		        Criteria c = e.createCriteria();
		       c.andCgJzLike(textData+'%');
		        List<JhCgd> list = JhCgdMapper.selectByExample(e);
		return list;

	}


}
