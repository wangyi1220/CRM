package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OfficeKpi;


public interface KPIService {
public void add(OfficeKpi k);
	
	//�޸�
    public void update(OfficeKpi k);
    
    //ɾ��
    public void delete(OfficeKpi k);
    
    //��ȡ����
    public OfficeKpi get(Integer kid);
    
    //��ѯ
    public List <OfficeKpi> select();

	public PageInfo <OfficeKpi> selectpage(Integer pageNum,Integer pageSize);


}
