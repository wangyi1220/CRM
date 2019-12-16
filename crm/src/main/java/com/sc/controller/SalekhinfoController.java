package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SaleKhinfo;
import com.sc.service.SaleService;

@Controller
@RequestMapping("/SalekhinfoController")
public class SalekhinfoController {
	
	@Autowired
	SaleService saleService;
	
	@RequestMapping("/list.do")
	public ModelAndView list(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			SaleKhinfo s){
		
		mav.addObject("p", saleService.select(pageNum, pageSize, s));
		mav.setViewName("wlq/Khinfo");
		
		return mav;
	}
	
	@RequestMapping("/lxlist.do")
	public ModelAndView lxlist(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			String name){
		
		System.out.println(name);
		
		mav.addObject("q", saleService.lxselect(pageNum, pageSize));
		mav.addObject("name", name);
		mav.setViewName("wlq/lxinfo");
		
		return mav;
	}


}
