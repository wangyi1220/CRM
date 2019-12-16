package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeTaskAssessment;
import com.sc.mapper.OfficeTaskAssessmentMapper;
import com.sc.service.OfficeTaskAssessmentService;

@Service
public class OfficeTaskAssessmentServiceImpl implements OfficeTaskAssessmentService {
    @Autowired 
    OfficeTaskAssessmentMapper OfficeTaskAssessmentMapper;
	@Override
	public void add(OfficeTaskAssessment t) {
		if(t!=null){
			this.OfficeTaskAssessmentMapper.insert(t);
		}

	}

	@Override
	public void update(OfficeTaskAssessment t) {
		if(t!=null&&t.getTaskId()!=null){
			this.OfficeTaskAssessmentMapper.updateByPrimaryKey(t);
		}

	}

	@Override
	public void delete(OfficeTaskAssessment t) {
		 if(t!=null){
			 this.OfficeTaskAssessmentMapper.deleteByPrimaryKey(t.getTaskId());
		 }

	}

	@Override
	public OfficeTaskAssessment get(BigDecimal tid) {
		if(tid!=null){
			return this.OfficeTaskAssessmentMapper.selectByPrimaryKey(tid);
		}
		return null;
	}

	@Override
	public List<OfficeTaskAssessment> select() {
		return this.OfficeTaskAssessmentMapper.selectByExample(null);
	}

	@Override
	public OfficeTaskAssessment login(OfficeTaskAssessment t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<OfficeTaskAssessment> selectpage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OfficeTaskAssessment> list = this.OfficeTaskAssessmentMapper.selectByExample(null);
		PageInfo<OfficeTaskAssessment> page=new PageInfo<OfficeTaskAssessment>(list);
		return page;
		
	}

}
