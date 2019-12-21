package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoods;
import  com.sc.entity.SaleSoutOrderExample.Criteria;

import com.sc.entity.SaleSoutOrder;
import com.sc.entity.SaleSoutOrderExample;
import com.sc.mapper.SaleSoutOrderMapper;
import com.sc.service.SOutOrderService;



public class SOutOrderServiceImpl implements SOutOrderService {
	@Autowired
	SaleSoutOrderMapper saleSoutOrderMapper;
	@Override
	public PageInfo<SaleSoutOrder> select(Integer pageNum, Integer pageSize, SaleSoutOrder sout) {
		PageHelper.startPage(pageNum, pageSize);
		SaleSoutOrderExample example = new SaleSoutOrderExample();
	    Criteria c = example.createCriteria();
		if(sout!=null&&sout.getInvoiceNum()!=null){
			c.andInvoiceNumLike(("%" + sout.getInvoiceNum() + "%"));
		}
		
		List<SaleSoutOrder> list = this.saleSoutOrderMapper.selectByExample(example);
		PageInfo<SaleSoutOrder> pageInfo = new PageInfo<SaleSoutOrder>(list);
		return pageInfo;
	}
	

	@Override
	public void add(SaleSoutOrder sout) {
		saleSoutOrderMapper.insert(sout);
	}

	@Override
	public void update(SaleSoutOrder sout) {
		saleSoutOrderMapper.updateByPrimaryKey(sout);
	}

	@Override
	public void delete(long soid) {
		saleSoutOrderMapper.deleteByPrimaryKey(soid);

	}

	

	@Override
	public List<SaleSoutOrder> getAll() {
		List<SaleSoutOrder> list = saleSoutOrderMapper.selectByExample(null);
		return list;
	}


	@Override
	public SaleSoutOrder getSordeID(long soid) {
		return saleSoutOrderMapper.selectByPrimaryKey(soid);
	}

}
