package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.service.JhGysxxService;

@Controller
@RequestMapping("/GongYingShangctrl")
public class GongYingShangctrl {
	
	@Autowired
	JhGysxxService  jhGysxxService;

	
	
	@RequestMapping("/list.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhGysxxService.selectpage(pageNum, pageSize));
		
		mav.setViewName("gysListPage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
}
