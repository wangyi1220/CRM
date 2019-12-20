package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.KcGoods;
import com.sc.entity.SysUsers;

public interface KcGoodsService {
	       //分页商品名字查询
			public PageInfo<KcGoods> select(Integer pageNum,Integer pageSize,  KcGoods kcgs);//kcgs--KcCangku

			//添加
			public void add(KcGoods kcgs);
			
			//修改
		    public void update(KcGoods kcgs);
		    
		    //删除
		    public void delete(long gId);//gId--goodsId
		    
		    //通过主键仓库编号获取对象
		    public KcGoods  getGsID(long  gId);
}
