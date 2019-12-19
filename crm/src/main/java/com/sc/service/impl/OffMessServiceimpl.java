package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.OffMessdeta;
import com.sc.entity.SysUsers;
import com.sc.mapper.OffMessMapper;
import com.sc.mapper.SysUsersMapper;
import com.sc.service.OffMessService;

@Service
public class OffMessServiceimpl implements OffMessService {

	@Autowired
	OffMessMapper offMessMapper;
	
	@Autowired
	SysUsersMapper sysUsersMapper;
	
	@Override
	public void add(OffMess m) {
		
		 this.offMessMapper.insert(m);

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
		//设置分页数据，开始分页
				PageHelper.startPage(pageNum, pageSize);
				//查询当前页的集合数据
				List<OffMess> list = this.offMessMapper.selectByExample(null);
				//封装成pageinfo对象
				PageInfo<OffMess> page=new PageInfo<OffMess>(list);
				
				return page;
	}

	@Override
	public PageInfo<OffMess> selectdeta(Integer pageNum, Integer pageSize, String ser) {
		//设置分页数据，开始分页
		System.out.println("进入服务器接口");
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据
		List<OffMess> list = this.offMessMapper.messdeta(ser);
		
		for (OffMess md : list) {
		    System.out.println(md);
		    for (OffMessdeta x : md.getOffMessdeta()) {
				System.out.println(x);
			}
		}
		
		//封装成pageinfo对象
		PageInfo<OffMess> page=new PageInfo<OffMess>(list);
		
		return page;
	}

	@Override
	public List<OffMess> mdetail(Long mid) {
		return this.offMessMapper.mdetail(mid);
		 
	}

	

	

}
