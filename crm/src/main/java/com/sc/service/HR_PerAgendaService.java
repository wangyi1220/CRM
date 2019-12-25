package com.sc.service;

import java.util.List;

import com.sc.entity.OOfficePerSche;



//bean鐨勫悕瀛楁槸usersDao
public interface HR_PerAgendaService {
	//娣诲姞鏂规硶
	public void addSchedule(OOfficePerSche sche);
	
    //閫氳繃id鑾峰彇瀹炰綋绫诲璞�
	public OOfficePerSche getScheduleById(String id);
	
	//淇敼鏂规硶
	public void updateSchedule(OOfficePerSche sche);
	
	//鍒犻櫎鏂规硶
	public void delSchedule(OOfficePerSche sche);
	
	//鏌ヨ鏂规硶
	public List getAllSchedule(OOfficePerSche sche);

	
}
