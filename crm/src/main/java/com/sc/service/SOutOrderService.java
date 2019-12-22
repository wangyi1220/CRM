package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.KcGoods;
import com.sc.entity.SaleSoutOrder;
import com.sc.entity.SysUsers;

public interface SOutOrderService {
	       //分页查询
			public PageInfo<SaleSoutOrder> select(Integer pageNum,Integer pageSize,  SaleSoutOrder sout);//sout--SaleSoutOrder

			//添加
			public void add(SaleSoutOrder sout);
			
			//修改
		    public void update(SaleSoutOrder sout);
		    
		    //删除
		    public void delete(long soid);//soid--sorderId
		    
		    //ͨ通过主键查询对象
		    public SaleSoutOrder  getSordeID(long  soid);
		    //查询所有
		    public List<SaleSoutOrder> getAll();

			
}
