package com.sc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;
import com.sc.entity.JhGysxxExample;
import com.sc.entity.JhGysxxExample.Criteria;
import com.sc.mapper.JhGysxxMapper;
import com.sc.service.JhGysxxService;

@Service
public class JhGysxxServiceImpl implements JhGysxxService {

@Autowired
JhGysxxMapper jhGysxxMapper;

	@Override
	public void add(JhGysxx gys) {
		// TODO Auto-generated method stub
		jhGysxxMapper.insert(gys);
	}

	@Override
	public void update(JhGysxx gys) {
		// TODO Auto-generated method stub
		jhGysxxMapper.updateByPrimaryKey(gys);
	}



	@Override
	public List<JhGysxx> list() {
		// TODO Auto-generated method stub
		return jhGysxxMapper.selectByExample(null);
	}

	@Override
	public void delete(Long gysId) {
		// TODO Auto-generated method stub
		jhGysxxMapper.deleteByPrimaryKey(gysId);
	}

	@Override
	public JhGysxx get(Long gysId) {
		// TODO Auto-generated method stub
		return jhGysxxMapper.selectByPrimaryKey(gysId);
	}
	

	@Override
	public PageInfo<JhGysxx> selectpage(Integer pageNum, Integer pageSize) {

		
		PageHelper.startPage(pageNum, pageSize);
		

		List<JhGysxx> list = this.jhGysxxMapper.selectByExample(null);

		PageInfo<JhGysxx> page=new PageInfo<JhGysxx>(list);
		
		return page;
	}
	//模糊查询
	@Override
	public List<JhGysxx> searchByName(String textData) {
		         JhGysxxExample e = new JhGysxxExample();
		        Criteria c = e.createCriteria();
		       c.andGysNameLike(textData+'%');
		        List<JhGysxx> list = jhGysxxMapper.selectByExample(e);
		return list;

	}

	//模糊查询（具体）
	@Override
	public PageInfo<JhGysxx> searchByLikeName(String gysName,Integer pageNum, Integer pageSize) {
		JhGysxxExample e = new JhGysxxExample();
        Criteria c = e.createCriteria();
        c.andGysNameEqualTo(gysName);
        List<JhGysxx> seledtByLikeGysNamelist = jhGysxxMapper.selectByExample(e);
    	PageInfo<JhGysxx> page=new PageInfo<JhGysxx>(seledtByLikeGysNamelist);
		return page;
	}


	



}
