package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeKpi;
import com.sc.mapper.OfficeKpiMapper;
import com.sc.service.KPIService;
@Service
public class KpiServiceImpl implements KPIService {
    @Autowired  
    OfficeKpiMapper  OfficeKpiMapper;
    //添加办公考核指标；
	@Override
	public void add(OfficeKpi k) {
		if(k!=null){
			this.OfficeKpiMapper.insert(k);
		}
	}
    //通过主键修改考核指标信息
	@Override
	public void update(OfficeKpi k) {
		if(k!=null&&k.getKpiId()!=null){
			this.OfficeKpiMapper.updateByPrimaryKey(k);
		}
	}
   //通过id删除已有或者错误的KPI指标记录；
	@Override
	public void delete(OfficeKpi k) {
		if(k!=null){
			 this.OfficeKpiMapper.deleteByPrimaryKey(k.getKpiId());
		}

	}
    //通过单个考核指标id获取kpi表中的数据    
	@Override
	public OfficeKpi get(Integer kid) {
		if(kid!=null){
			return this.OfficeKpiMapper.selectByPrimaryKey(kid);
		}
		return null;
	}

	@Override
	public List<OfficeKpi> select() {
		return this.OfficeKpiMapper.selectByExample(null);//查询所有
	}
    //分页
	@Override
	public PageInfo<OfficeKpi> selectpage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OfficeKpi> list = this.OfficeKpiMapper.selectByExample(null);
		PageInfo<OfficeKpi> page=new PageInfo<OfficeKpi>(list);
		return page;
	}

}
