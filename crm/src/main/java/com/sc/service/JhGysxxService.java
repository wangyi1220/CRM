//进货（供应商信息）
package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;


public interface JhGysxxService {
		//查询
		public List<JhGysxx> list();
		//添加
		public void add(JhGysxx gys);
		//修改
		public void update(JhGysxx gys);
		//删除
		public void delete(Long gysId);
		//删除选中
		//public void deleteSelect(String ids);
		//获取对象
		public JhGysxx get(Long gysId);
		//分页查询
		public PageInfo<JhGysxx> selectpage(Integer pageNum,Integer pageSize);
		//搜索框模糊查询
		public List<JhGysxx> searchByName(String textData);
}
