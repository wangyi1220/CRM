package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysPostService;
import com.sc.service.SysUsersService;

import net.bytebuddy.asm.Advice.This;

@Controller
@RequestMapping("/SysPostCtrl")
public class SysPostCtrl {
	
	@Autowired
	SysPostService sysPostService ;
	
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="3")Integer pageSize){
		
		mav.addObject("p", sysPostService.select(pageNum, pageSize));
		mav.setViewName("ssf/Postlistpage");
		System.out.println(sysPostService.select(pageNum, pageSize));
		
		System.out.println("·ÖÒ³");
		
		return mav;
	}
}
