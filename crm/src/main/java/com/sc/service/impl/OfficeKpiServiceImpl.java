package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeKpi;
import com.sc.mapper.OfficeKpiMapper;
import com.sc.service.OfficeKpiService;
@Service
public class OfficeKpiServiceImpl implements OfficeKpiService {
    @Autowired  
    OfficeKpiMapper officeKpiMapper;
	@Override
	public void add(OfficeKpi k) {
		if(k!=null){
			  this.officeKpiMapper.insert(k);
			}

	}

	@Override
	public void update(OfficeKpi k) {
		if(k!=null&&k.getKpiId()!=null){
			this.officeKpiMapper.updateByPrimaryKey(k);
		}
	}

	@Override
	public void delete(OfficeKpi k) {
		if(k!=null){
			this.officeKpiMapper.deleteByPrimaryKey(k.getKpiId());
		}

	}

	@Override
	public OfficeKpi get(BigDecimal kid) {
		if(kid!=null){
			   return this.officeKpiMapper.selectByPrimaryKey(kid);
			}
			return null;
	}

	@Override
	public List<OfficeKpi> select() {
		
		return this.officeKpiMapper.selectByExample(null);
	}

	@Override
	public OfficeKpi login(OfficeKpi u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<OfficeKpi> selectpage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OfficeKpi> list = this.officeKpiMapper.selectByExample(null);
		PageInfo<OfficeKpi> page=new PageInfo<OfficeKpi>(list);
		return page;
		
	}

}
