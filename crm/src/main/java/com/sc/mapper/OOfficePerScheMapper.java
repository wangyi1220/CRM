package com.sc.mapper;

import java.util.List;

import com.sc.entity.OOfficePerSche;

public interface OOfficePerScheMapper {
    int insert(OOfficePerSche record);

    int insertSelective(OOfficePerSche record);
    
    
    //锟斤拷臃锟斤拷锟�
	public void addSchedule(OOfficePerSche sche);
	
    //通锟斤拷id锟斤拷取实锟斤拷锟斤拷锟斤拷锟�
	public OOfficePerSche getScheduleById(String id);
	
	//锟睫改凤拷锟斤拷
	public void updateSchedule(OOfficePerSche sche);
	
	//删锟斤拷锟斤拷锟斤拷
	public void delSchedule(OOfficePerSche sche);
	
	//锟斤拷询锟斤拷锟斤拷
	public List getAllSchedule(OOfficePerSche sche);

	//锟斤拷锟斤拷粘锟街帮拷炔锟窖拷锟斤拷菘锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟街�
	public String getMaxIdoOfficePerSche();

	// 锟斤拷锟斤拷锟秸筹拷锟叫憋拷锟斤拷页锟斤拷询锟斤拷
	public List<OOfficePerSche> getOPerAgendaList(OOfficePerSche oOfficePerSche);	
}