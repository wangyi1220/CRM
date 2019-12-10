package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SaleKhinfo;
import com.sc.mapper.SaleKhinfoMapper;
import com.sc.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    SaleKhinfoMapper saleKhinfoMapper ;
	@Override
	public List<SaleKhinfo> select() {
		// TODO Auto-generated method stub
		return this.saleKhinfoMapper.selectByExample(null);
	}

}
