package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OffMess;

import com.sc.service.OffMessService;

@Controller
@RequestMapping
public class OffMessController {
	
	@Autowired
	OffMessService offMessService;
	
	@RequestMapping("/messlist.do")
	public ModelAndView list(ModelAndView mav){
		System.out.println("查询短消息列表！");
		
		//查询list集合
		List<OffMess> list = this.offMessService.select();
		mav.addObject("list", list);//list集合存入模型
		mav.setViewName("messlist");// 路径是：/WEB-INF/messlist.jsp
		return mav;
	}
	
	@RequestMapping("/listpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查询短消息列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", offMessService.selectpage(pageNum, pageSize));
		
		mav.setViewName("messlistpage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}

}
