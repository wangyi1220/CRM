package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
			SaleKhinfo s,String iscg){
		
		mav.addObject("p", saleService.select(pageNum, pageSize, s));
		if(iscg!=null){
			mav.addObject("iscg", "yes");
		}
		mav.setViewName("wlq/Khinfo");
		
		return mav;
	}
	
	@RequestMapping("/lxlist.do")
	public ModelAndView lxlist(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			String name,
			String id ){
		
		System.out.println(name);
		
		mav.addObject("q", saleService.lxselect(pageNum, pageSize));
		mav.addObject("name", name);
		mav.addObject("id", id);
		mav.setViewName("wlq/lxinfo");
		
		return mav;
	}
	
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav,
			HttpServletRequest req,
			SaleKhinfo s){
		
		this.saleService.update(s);
		mav.setViewName("redirect:list.do");//重定向到list方法
		return mav;		
	}
	
	@RequestMapping("/add.do")
	public ModelAndView add(ModelAndView mav,
			HttpServletRequest req,
			SaleKhinfo s){
		
		this.saleService.add(s);
		mav.addObject("iscg", "yes");
		mav.setViewName("redirect:list.do?iscg=yes");
		return mav;

}
	//联系人
	@RequestMapping("/lxcx.do")
	public ModelAndView lxcx(ModelAndView mav,
			HttpSession se,
			Long id,
			String name){
		if(id==null){		
			id=(Long)se.getAttribute("id");
		}
		if(name==null){
			name=(String)se.getAttribute("name");
		}
		mav.addObject("q", saleService.lxcx(id));
		se.setAttribute("id", id);
		se.setAttribute("name", name);
		mav.setViewName("wlq/lxinfo");
		
		return mav;
		
	}
}
