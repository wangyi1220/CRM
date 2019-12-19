package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.SysUsers;


public interface OffMessService {
	
	public List<OffMess> mdetail(Long mid);
	
		
	
		//添加
		public void add(OffMess m);
		
		//修改
	    public void update(OffMess m);
	    
	    //删除
	    public void delete(OffMess m);
	    
	    //获取
	    public OffMess get(OffMess m);
	    
	 //查询
	 public List<OffMess> select();

	   
	
	//查询列表-分页
	public PageInfo<OffMess> selectpage(Integer pageNum,Integer pageSize);
	
	public PageInfo<OffMess> selectdeta(Integer pageNum,Integer pageSize,String ser);

}
