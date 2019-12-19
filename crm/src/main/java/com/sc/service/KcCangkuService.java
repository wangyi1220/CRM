package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.SaleSinfo;
import com.sc.entity.SysUsers;

public interface KcCangkuService {
	//分页仓库名字查询
		public PageInfo<KcCangku> select(Integer pageNum,Integer pageSize,  KcCangku kcck);//kcck--KcCangku

		//添加
		public void add(KcCangku kcck);
		
		//修改
	    public void update(KcCangku kcck);
	    
	    //删除
	    public void delete(long cangkuId);
	    
	    //通过主键仓库编号获取对象
	    public KcCangku  getCkID(long  cangkuId);
	   
}
