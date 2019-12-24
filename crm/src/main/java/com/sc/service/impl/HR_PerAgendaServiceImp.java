package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.OOfficePerSche;
import com.sc.mapper.OOfficePerScheMapper;
import com.sc.service.HR_PerAgendaService;

@Service
public class HR_PerAgendaServiceImp  implements HR_PerAgendaService{
	
	@Autowired
	OOfficePerScheMapper oofficePerScheMapper;
   
	//娣诲姞鏂规硶
	public void addSchedule(OOfficePerSche sche){
		oofficePerScheMapper.addSchedule(sche);
	}
	
	
    //閫氳繃id鑾峰彇瀹炰綋绫诲璞�
	public OOfficePerSche getScheduleById(String id){
		return oofficePerScheMapper.getScheduleById(id);
	}
	
	//淇敼鏂规硶
	public void updateSchedule(OOfficePerSche sche){
		oofficePerScheMapper.updateSchedule(sche);
	}
	
	//鍒犻櫎鏂规硶
	public void delSchedule(OOfficePerSche sche){
		oofficePerScheMapper.delSchedule(sche);
	}
	
	//鏌ヨ鏂规硶
	public List getAllSchedule(OOfficePerSche sche){
		return oofficePerScheMapper.getAllSchedule(sche);
	}
	
}
