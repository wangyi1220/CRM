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
			@RequestParam(defaultValue="10")Integer pageSize){
		System.out.println("查询客户信息表");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", saleService.select(pageNum, pageSize));
		
		mav.setViewName("wlq/Khinfo");
		
		return mav;
	}
	
	

}
