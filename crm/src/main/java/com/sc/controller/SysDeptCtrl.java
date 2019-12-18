package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysDept;
import com.sc.entity.SysPost;
import com.sc.service.SysDeptService;

@Controller
@RequestMapping("/SyDeptCtrl")
public class SysDeptCtrl {
	@Autowired
	SysDeptService sysDeptService;
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="3")Integer pageSize){
		
		mav.addObject("p", sysDeptService.select(pageNum, pageSize));
		mav.setViewName("ssf/DEPTlistpage");
		System.out.println(sysDeptService.select(pageNum, pageSize));
		
		System.out.println("分页");
		
		return mav;
	}
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav, SysDept s) {
		System.out.println("删除用户！" + s);
		this.sysDeptService.del(s);
		mav.setViewName("redirect:listPage.do");// 重定向到list方法
		return mav;
	}
}
