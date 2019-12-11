package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;


public interface OffMessService {
	
	
		//添加
		public void add(OffMess m);
		
		//修改
	    public void update(OffMess m);
	    
	    //删除
	    public void delete(OffMess m);
	    
	    //获取对象
	    public OffMess get(OffMess m);
	    
	 //查询
	 public List<OffMess> select();

	   
	
	//分页查询
	public PageInfo<OffMess> selectpage(Integer pageNum,Integer pageSize);

}
