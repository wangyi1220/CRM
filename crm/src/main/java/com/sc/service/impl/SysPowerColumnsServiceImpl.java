package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysPowerColumnsExample;
import com.sc.entity.SysPowerColumnsExample.Criteria;
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
	public PageInfo<SysPowerColumns> selectList(Integer pageNum, Integer pageSize,SysUsers su) {
		PageHelper.startPage(pageNum, pageSize);
		
		SysUsers users = this.sysUsersMapper.selectPower(su);
		System.out.println(users.toString());
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

	@Override
	public SysPowerColumns selectByCname(String columnsName) {
		SysPowerColumnsExample example = new SysPowerColumnsExample();
		Criteria criteria = example.createCriteria();
		criteria.andColumnsNameEqualTo(columnsName);
		List<SysPowerColumns> list = this.sysPowerColumnsMapper.selectByExample(example);
		return list.get(0);
	}

}
