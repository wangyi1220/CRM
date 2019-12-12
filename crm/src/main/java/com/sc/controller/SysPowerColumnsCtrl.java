package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/SysPowerColumnsCtrl")
public class SysPowerColumnsCtrl {
	
	@RequestMapping("/inAddPowerColumns.do")
	public ModelAndView inAddPowerColumns(ModelAndView mav){
		
		mav.setViewName("wangyi/addpowercolumns");
		return mav;
		
	}
	
	@RequestMapping("/addPowerColumns.do")
	public ModelAndView addPowerColumns(ModelAndView mav){
		
		mav.setViewName("wangyi/addpowercolumns");
		return mav;
		
	}
	
}
