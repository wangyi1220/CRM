package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhGysxx;

public interface JhCgdService {

	//查询
	public  List<JhCgd> list();
	//添加
	public void add(JhCgd cgd);
	//修改
	public void update(JhCgd cgd);
	//删除
	public void delete(Long cgdId);
	//删除选中
	//public void deleteSelect(String ids);
	//获取对象
	public JhCgd get(Long cgdId);
	//分页查询
	public PageInfo<JhCgd> selectpage(Integer pageNum,Integer pageSize);
	//搜索框模糊查询
	public List<JhCgd> searchByName(String textData);
	
}
