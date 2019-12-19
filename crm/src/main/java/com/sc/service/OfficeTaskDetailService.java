package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeTaskDetail;


public interface OfficeTaskDetailService {
public void add(OfficeTaskDetail d);
	
	
    public void update(OfficeTaskDetail d);
    
    
    public void delete(OfficeTaskDetail d);
    
   
    public OfficeTaskDetail  get(BigDecimal did);
    
    public OfficeTaskDetail  get1(BigDecimal taskid);
    
    
    public List <OfficeTaskDetail> select();

   
   
    
    public PageInfo <OfficeTaskDetail> selectpage(Integer pageNum,Integer pageSize);



}
