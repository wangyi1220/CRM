package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoods;
import com.sc.entity.KcGoodsExample;
import com.sc.entity.KcGoodsExample.Criteria;
import com.sc.mapper.KcGoodsMapper;
import com.sc.service.KcGoodsService;

@Service
public class KcGoodsServiceImpl implements KcGoodsService {

	
	@Autowired
	KcGoodsMapper kcGoodsMapper;
	@Override
	public PageInfo<KcGoods> select(Integer pageNum, Integer pageSize, KcGoods kcgs) {
		PageHelper.startPage(pageNum, pageSize);
		KcGoodsExample example = new KcGoodsExample();
		//通过商品名称模糊查询
		Criteria c = example.createCriteria();
		if(kcgs!=null&&kcgs.getGoodsName()!=null){
			c.andGoodsNameLike("%" + kcgs.getGoodsName() + "%");
		}
		Criteria c1 = example.or();
		//通过商品类别模糊查询
		if(kcgs!=null&&kcgs.getGoodsName()!=null){
			/*c.andGoodsNameLike("%" + kcgs.getGoodsName() + "%");*/
			c1.andGoodsKindsLike("%"+kcgs.getGoodsName()+"%");
		}
		
		List<KcGoods> list = this.kcGoodsMapper.selectByExample(example);
		PageInfo<KcGoods> pageInfo = new PageInfo<KcGoods>(list);
		return pageInfo;
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
	//ͨ通过id查询
	@Override
	public KcGoods getGsID(long gId) {
		
		return kcGoodsMapper.selectByPrimaryKey(gId) ;
	}
	@Override //查询所有
	public List<KcGoods> getAll() {
		List<KcGoods> list = kcGoodsMapper.selectByExample(null);
		return list;
	}
	

}
