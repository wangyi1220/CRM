package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeKpi;


public interface OfficeKpiService {
	//���
		public void add(OfficeKpi k);
		
		//�޸�
	    public void update(OfficeKpi k);
	    
	    //ɾ��
	    public void delete(OfficeKpi k);
	    
	    //��ȡ����
	    public OfficeKpi get(BigDecimal kid);
	    
	    //��ѯ
	    public List <OfficeKpi> select();

	    //��¼
	    public OfficeKpi login(OfficeKpi u);
	    
	    public PageInfo <OfficeKpi> selectpage(Integer pageNum,Integer pageSize);


}
