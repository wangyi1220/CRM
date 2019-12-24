package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeKpi;
import com.sc.entity.OfficeTaskAssessment;


public interface OfficeKpiService {

		public void add(OfficeKpi k);
		
		
	    public void update(OfficeKpi k);
	    
	    
	    public void delete(OfficeKpi k);
	    
	   
	    public OfficeKpi get(BigDecimal kid);
	    
	    
	    public List <OfficeKpi> select();
	    
	    public List <OfficeTaskAssessment> toadd();
	    
	    
	    public OfficeKpi login(OfficeKpi u);
	    
	    public PageInfo <OfficeKpi> selectpage(Integer pageNum,Integer pageSize);


}
