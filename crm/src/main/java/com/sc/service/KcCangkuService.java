package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.SysUsers;

public interface KcCangkuService {
	//通过仓库名查询仓库信息表对象
	public PageInfo<KcCangku> select(Integer pageNum,Integer pageSize);
		
}
