package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoods;
import com.sc.entity.SaleSinfo;
import com.sc.entity.SaleSinfoExample;
import com.sc.entity.SaleSoutOrder;
import com.sc.entity.SaleSinfoExample.Criteria;
import com.sc.mapper.SaleSinfoMapper;
import com.sc.service.SInfoService;

@Service
public class SInfoServiceImpl implements SInfoService {

	// 依赖注入
	@Autowired
	SaleSinfoMapper saleSinfoMapper;
	//分页查询
	@Override
	public PageInfo<SaleSinfo> select(Integer pageNum, Integer pageSize, Long soid) {
		PageHelper.startPage(pageNum, pageSize);
		SaleSinfoExample example = new SaleSinfoExample();
		Criteria c = example.createCriteria();
		System.out.println("得到的详情id"+soid);
		if(soid!=null){
			c.andSorderIdEqualTo(soid);
			List<SaleSinfo> list = this.saleSinfoMapper.selectByExample(example);
			PageInfo<SaleSinfo> pageInfo = new PageInfo<SaleSinfo>(list);
			if(list!=null&&list.size()>0){
				return pageInfo;
			}
		}
		return null;
		
	}
	

	@Override
	public void add(SaleSinfo sinfo) {
		saleSinfoMapper.insert(sinfo);
		
	}

	@Override
	public void update(SaleSinfo sinfo) {
		saleSinfoMapper.updateByPrimaryKey(sinfo);
		
	}

	
	//通过sorderId获取对象
	@Override
	public SaleSinfo get(long sid) {
	
		return	this.saleSinfoMapper.selectByPrimaryKey(sid);
			
			
			
	}

	//获取所有
	@Override
	public List<SaleSinfo> getAll() {
		List<SaleSinfo> list = saleSinfoMapper.selectByExample(null);
		return list;
		
		
	}

	//通过主键删除
	@Override
	public void delete(Long sid) {
		saleSinfoMapper.deleteByPrimaryKey(sid);
		
	}


	@Override //通过soid获取该soid下所有的销售详情集合
	public List<SaleSinfo> getsoidlist(Long soid) {
		SaleSinfoExample example = new SaleSinfoExample();
		Criteria c = example.createCriteria();
		c.andSorderIdEqualTo(soid);
		List<SaleSinfo> list = saleSinfoMapper.selectByExample(example);
		return list;
	}
	

}
