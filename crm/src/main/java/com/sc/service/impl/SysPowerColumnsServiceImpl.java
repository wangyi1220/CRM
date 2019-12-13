package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysUsers;
import com.sc.mapper.SysPowerColumnsMapper;
import com.sc.mapper.SysUsersMapper;
import com.sc.service.SysPowerColumnsService;

@Service
public class SysPowerColumnsServiceImpl implements SysPowerColumnsService {

	@Autowired
	SysPowerColumnsMapper  sysPowerColumnsMapper;
	
	@Autowired
	SysUsersMapper sysUsersMapper;
	
	@Override
	public void addSysPowerColumns(SysPowerColumns spc) {
		
		this.sysPowerColumnsMapper.insert(spc);
	}

	@Override
	public PageInfo<SysPowerColumns> selectList(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		SysUsers sysUsers = new SysUsers();
		sysUsers.setUsersId(61L);
		SysUsers users = this.sysUsersMapper.selectPower(sysUsers);
		
		List<SysPowerColumns> list = this.sysPowerColumnsMapper.selectPowerinfo();
		for (SysPowerColumns spc : list) {
			
			
			for (SysPowerinfo spi1 : spc.getSysPowerinfoes()) {
				for (SysPowerinfo spi2 : users.getSysPowerinfoes()) {
					if(spi1.getPowerId()==spi2.getPowerId()){
						spi1.setIsHasPower("1");
					}
				}
			}
		}
		PageInfo<SysPowerColumns> pageInfo = new PageInfo<SysPowerColumns>(list);
		
		return pageInfo;
	}

}
