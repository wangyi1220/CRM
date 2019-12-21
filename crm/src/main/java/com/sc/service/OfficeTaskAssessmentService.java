package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeKpi;
import com.sc.entity.OfficeTaskAssessment;


public interface OfficeTaskAssessmentService {
	public void add(OfficeTaskAssessment t);
	
	
    public void update(OfficeTaskAssessment t);
    
    public void updateByCompanyId(OfficeTaskAssessment t);
    
    public void delete(OfficeTaskAssessment t);
    public void  deleteByCompanyId(BigDecimal CompanyId);
   
    public OfficeTaskAssessment get(BigDecimal tid);
    
    
    public List <OfficeTaskAssessment> select();
    public List <OfficeTaskAssessment>  selectKpi(String taskKpi);
   
   
    public OfficeTaskAssessment login(OfficeTaskAssessment t);
    
    public PageInfo <OfficeTaskAssessment> selectpage(Integer pageNum,Integer pageSize);


}
