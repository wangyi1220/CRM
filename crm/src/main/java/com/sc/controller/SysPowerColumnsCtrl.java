package com.sc.controller;

import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysUsers;
import com.sc.service.SysPowerColumnsService;
import com.sc.service.SysUsersService;
import com.sc.service.impl.SysPowerColumnsServiceImpl;

import oracle.sql.DATE;

@Controller
@RequestMapping("/SysPowerColumnsCtrl")
public class SysPowerColumnsCtrl {
	
	@Autowired
	SysPowerColumnsService sysPowerColumnsService;
	
	@Autowired
	SysUsersService sysUsersService;
	
	@RequestMapping("/inAddPowerColumns.do")
	public ModelAndView inAddPowerColumns(ModelAndView mav){
		
		mav.setViewName("wangyi/addpowercolumns");
		return mav;
		
	}
	
	@RequestMapping("/addPowerColumns.do")
	public ModelAndView addPowerColumns(ModelAndView mav,SysPowerColumns spc) throws SQLException{
		
		System.out.println("名："+spc.getColumnsName());
		System.out.println("注解："+spc.getRemarks());
		Date date = new Date();
		spc.setChangeDate(date);
		this.sysPowerColumnsService.addSysPowerColumns(spc);
		System.out.println("添加成功");
		mav.addObject("issuc", "yes");
		mav.setViewName("wangyi/addpowercolumns");
		return mav;
		
	}
	
	@RequestMapping("/PowerinfoList.do")
	public ModelAndView PowerinfoList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="100")Integer pageSize){
		SysUsers sysUsers = new SysUsers();
		sysUsers.setUsersId(61L);
		mav.addObject("p", this.sysPowerColumnsService.selectList(pageNum, pageSize,sysUsers));
		mav.setViewName("wangyi/powerinfolist");
		return mav;
		
	}
	
}
