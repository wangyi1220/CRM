package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeTaskAssessment;


public interface OfficeTaskAssessmentService {
	public void add(OfficeTaskAssessment t);
	
	
    public void update(OfficeTaskAssessment t);
    
    
    public void delete(OfficeTaskAssessment t);
    
   
    public OfficeTaskAssessment get(BigDecimal tid);
    
    
    public List <OfficeTaskAssessment> select();

   
    public OfficeTaskAssessment login(OfficeTaskAssessment t);
    
    public PageInfo <OfficeTaskAssessment> selectpage(Integer pageNum,Integer pageSize);


}
