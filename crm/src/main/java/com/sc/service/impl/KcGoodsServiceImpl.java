package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.KcGoods;
import com.sc.entity.KcGoodsExample;
import com.sc.entity.KcGoodsExample.Criteria;
import com.sc.mapper.KcGoodsMapper;
import com.sc.service.KcGoodsService;

@Service
public class KcGoodsServiceImpl implements KcGoodsService {

	// 依赖注入
	@Autowired
	KcGoodsMapper kcGoodsMapper;
	@Override
	public PageInfo<KcGoods> select(Integer pageNum, Integer pageSize, KcGoods kcgs) {
		PageHelper.startPage(pageNum, pageSize);
		KcGoodsExample example = new KcGoodsExample();
		Criteria c = example.createCriteria();
		
		if(kcgs!=null&&kcgs.getGoodsName()!=null){
			c.andGoodsNameLike("%" + kcgs.getGoodsName() + "%");
			List<KcGoods> list = this.kcGoodsMapper.selectByExample(example);
			PageInfo<KcGoods> pageInfo = new PageInfo<KcGoods>(list);
			if(list!=null&&list.size()>0){
				return pageInfo;
			}
			
		}else{
			List<KcGoods> list = this.kcGoodsMapper.selectByExample(null);
			PageInfo<KcGoods> pageInfo = new PageInfo<KcGoods>(list);
			return pageInfo;
		}
		return null;
		
	}
	@Override
	public void add(KcGoods kcgs) {
		kcGoodsMapper.insert(kcgs);
		
	}
	@Override
	public void update(KcGoods kcgs) {
		kcGoodsMapper.updateByPrimaryKey(kcgs);
		
	}
	@Override
	public void delete(long gId) {
		kcGoodsMapper.deleteByPrimaryKey(gId);
		
	}
	//通过id获取库存商品信息
	@Override
	public KcGoods getGsID(long gId) {
		
		return kcGoodsMapper.selectByPrimaryKey(gId) ;
	}
	

}
