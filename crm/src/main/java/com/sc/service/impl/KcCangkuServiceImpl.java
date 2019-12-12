package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.mapper.KcCangkuMapper;
import com.sc.service.KcCangkuService;
@Service
public class KcCangkuServiceImpl implements KcCangkuService {

	//ÒÀÀµ×¢Èë
	@Autowired
	KcCangkuMapper kcCangkuMapper;

	@Override
	public PageInfo<KcCangku> select(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<KcCangku> list = kcCangkuMapper.selectByExample(null);//È«²é
		PageInfo<KcCangku> pageInfo = new PageInfo<KcCangku>(list);
		return pageInfo;
	}
	

}
