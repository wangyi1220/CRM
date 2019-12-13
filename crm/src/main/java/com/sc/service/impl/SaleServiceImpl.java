package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SaleKhinfo;
import com.sc.entity.SaleKhinfoExample;
import com.sc.entity.SysUsers;
import com.sc.entity.SaleKhinfoExample.Criteria;
import com.sc.mapper.SaleKhinfoMapper;
import com.sc.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    SaleKhinfoMapper saleKhinfoMapper ;
	@Override
	public PageInfo<SaleKhinfo> select(Integer pageNum,Integer pageSize, SaleKhinfo s) {
		
		PageHelper.startPage(pageNum, pageSize);
		SaleKhinfoExample example = new SaleKhinfoExample();
		Criteria c = example.createCriteria();
		c.andUserNameLike("%"+s.getUserName() +"%");
		
		
		if(s!=null&&s.getUserName()!=null&&s.getUserName()!=null){
			List<SaleKhinfo> list = this.saleKhinfoMapper.selectByExample(example);
			PageInfo<SaleKhinfo> pageInfo = new PageInfo<SaleKhinfo>(list);
			if(list!=null&&list.size()>0){
				return pageInfo;
			}
		}else{
			List<SaleKhinfo> list = saleKhinfoMapper.selectByExample(null);
			PageInfo<SaleKhinfo> pageInfo = new PageInfo<SaleKhinfo>(list);
			return pageInfo;
		}
		
		return null;
		
	}
	

}
