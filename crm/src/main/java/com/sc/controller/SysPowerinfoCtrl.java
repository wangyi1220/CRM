package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysPowerColumns;
import com.sc.entity.SysPowerinfo;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.service.SysPowerColumnsService;
import com.sc.service.SysPowerinfoService;

@Controller
@RequestMapping("/SysPowerinfoCtrl")
public class SysPowerinfoCtrl {

	@Autowired
	SysPowerinfoService sysPowerinfoService;
	
	@Autowired
	SysPowerColumnsService sysPowerColumnsService;
	
	@RequestMapping("/goaddPower.do")
	public ModelAndView goaddPower(ModelAndView mav){
		mav.setViewName("wangyi/addpower");
		return mav;
	}
	
	@RequestMapping("/addPower.do")
	public ModelAndView addPower(ModelAndView mav,SysPowerinfo spi,String columnsName){
		SysPowerColumns columns = this.sysPowerColumnsService.selectByCname(columnsName);
		this.sysPowerinfoService.addPower(spi);
		mav.setViewName("redirect:../SysPowerColumnsCtrl/PowerinfoList.do");
		return mav;
	}
}
