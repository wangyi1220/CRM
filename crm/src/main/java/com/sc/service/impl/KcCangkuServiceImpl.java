package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcCangku;
import com.sc.entity.KcCangkuExample;
import com.sc.entity.KcGoods;
import com.sc.entity.KcCangkuExample.Criteria;
import com.sc.mapper.KcCangkuMapper;
import com.sc.service.KcCangkuService;

@Service
public class KcCangkuServiceImpl implements KcCangkuService {

	// 依赖注入
	@Autowired
	KcCangkuMapper kcCangkuMapper;

	@Override
	public PageInfo<KcCangku> select(Integer pageNum, Integer pageSize, KcCangku kcck) {

		PageHelper.startPage(pageNum, pageSize);
		KcCangkuExample example = new KcCangkuExample();
		
		//通过商品名称模糊查询
				Criteria c = example.createCriteria();
				if(kcck!=null&&kcck.getCangkuName()!=null){
					c.andCangkuNameLike("%" + kcck.getCangkuName() + "%");
				}
								
				List<KcCangku> list = this.kcCangkuMapper.selectByExample(example);
				PageInfo<KcCangku> pageInfo = new PageInfo<KcCangku>(list);
				return pageInfo;

	}

	@Override
	public void add(KcCangku kcck) {
		kcCangkuMapper.insert(kcck);
	}

	@Override
	public void update(KcCangku kcck) {
		kcCangkuMapper.updateByPrimaryKey(kcck);
		
	}

	@Override
	public void delete(long cangkuId) {
		kcCangkuMapper.deleteByPrimaryKey(cangkuId);
		
	}

	//仓库id获取仓库对象
	@Override
	public KcCangku getCkID(long cangkuId) {
	return	kcCangkuMapper.selectByPrimaryKey(cangkuId);
		
	}

	


}
