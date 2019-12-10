package com.sc.service;

import com.sc.entity.KcCangku;

public interface KcCangkuService {
	//通过仓库名查询仓库信息表对象
	public KcCangku selectKC_CK(String cangkuName);
		
}
