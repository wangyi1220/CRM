package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysCompanyinfo;
import com.sc.entity.SysCompanyinfoExample;
import com.sc.mapper.SysCompanyinfoMapper;
import com.sc.service.SysCompanyInfoService;
@Service
public class SysCompanyInfoServiceImpl implements SysCompanyInfoService {
	@Autowired
	SysCompanyinfoMapper sysCompanyinfoMapper;
	@Override
	public PageInfo<SysCompanyinfo> select(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
        SysCompanyinfoExample e=new SysCompanyinfoExample();
        e.setOrderByClause("PK DESC");
		List<SysCompanyinfo> list = sysCompanyinfoMapper.selectByExample(e);
		
		PageInfo<SysCompanyinfo> pageInfo = new PageInfo<SysCompanyinfo>(list);
		
		return pageInfo;
	
	}

	@Override
	public void add(SysCompanyinfo s) {
		if (s != null){
			this.sysCompanyinfoMapper.insert(s);
		}

	}

	@Override
	public void del(SysCompanyinfo s) {
		if(s!=null){
			this.sysCompanyinfoMapper.deleteByPrimaryKey(s.getPk());
		}
	}

	@Override
	public void update(SysCompanyinfo s) {
		if (s != null&& s.getPk()!=null){
			this.sysCompanyinfoMapper.updateByPrimaryKey(s);
		}

	}

	@Override
	public SysCompanyinfo get(Long pk) {
		if(pk!=null){
			return this.sysCompanyinfoMapper.selectByPrimaryKey(pk);
		}
		return null;
	}

}
