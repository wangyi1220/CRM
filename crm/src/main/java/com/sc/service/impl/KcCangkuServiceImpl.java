package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.KcCangkuExample;
import com.sc.entity.SaleKhinfoExample.Criteria;
import com.sc.mapper.KcCangkuMapper;
import com.sc.service.KcCangkuService;
@Service
public class KcCangkuServiceImpl implements KcCangkuService {

	//“¿¿µ◊¢»Î
	@Autowired
	KcCangkuMapper kcCangkuMapper;

	

	@Override
	public PageInfo<KcCangku> select(Integer pageNum, Integer pageSize, KcCangku kcck) {
		
		PageHelper.startPage(pageNum, pageSize);
		KcCangkuExample example = new KcCangkuExample();
		//Criteria c = example.createCriteria();
		//c.andUserNameLike("%"+kcck.getCangkuName()+"%");
		return null;
		
		
		
	}
	

}
