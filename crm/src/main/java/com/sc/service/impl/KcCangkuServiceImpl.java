package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.KcCangku;
import com.sc.entity.KcCangkuExample;
import com.sc.entity.KcCangkuExample.Criteria;
import com.sc.mapper.KcCangkuMapper;
import com.sc.service.KcCangkuService;
@Service
public class KcCangkuServiceImpl implements KcCangkuService {

	//“¿¿µ◊¢»Î
	@Autowired
	KcCangkuMapper kcCangkuMapper;
	@Override
	public KcCangku selectKC_CK(String cangkuName) {
		KcCangkuExample example = new KcCangkuExample();
		Criteria criteria = example.createCriteria();
		return null;
	
	}

}
