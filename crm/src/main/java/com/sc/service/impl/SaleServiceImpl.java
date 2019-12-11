package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SaleKhinfo;
import com.sc.entity.SysUsers;
import com.sc.mapper.SaleKhinfoMapper;
import com.sc.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    SaleKhinfoMapper saleKhinfoMapper ;
	@Override
	public PageInfo<SaleKhinfo> select(Integer pageNum,Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		
		List<SaleKhinfo> list = saleKhinfoMapper.selectByExample(null);
		
		PageInfo<SaleKhinfo> pageInfo = new PageInfo<SaleKhinfo>(list);
		
		return pageInfo;
	}

}
