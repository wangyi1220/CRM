package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.service.JhCgdService;
import com.sc.service.JhCgdxqService;

@Controller
@RequestMapping("/caiGouDanCtrl")
public class caiGouDanCtrl {

	//注入sevice
	@Autowired
	JhCgdService  jhCgdService;
	
	@Autowired
	JhCgdxqService jhCgdxqService;
	
	//采购单页面显示
	@RequestMapping("/cgdList.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		PageInfo<JhCgd> ii = jhCgdService.selectpage(pageNum, pageSize);
		System.out.println("-------------------------------->>>>>>>>>>>>采购单页面");
		
		mav.addObject("pCgd",ii);
		
		mav.setViewName("fhw/JH-cgdListPage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	//采购单详情页面显示
	
	@RequestMapping("/cgdxqList.do")
	public ModelAndView cgdxqList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize,
			Long cgdId){
		System.out.println("查询采购单详情-分页！"+cgdId);
		
		//查询list集合-分页     ${page.list}
		PageInfo<JhCgdxq> ii = jhCgdxqService.selectpage(cgdId,pageNum, pageSize);
		System.out.println("-------------------------------->>>>>>>>>>>>采购单详情页面"+ii.getList().size());
		
		mav.addObject("pcgdxq",ii);
		
		mav.setViewName("fhw/JH-cgdXqListPage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
		//采购单删除
		@RequestMapping("/cgdDelete.do")
		public ModelAndView gysDelete(ModelAndView mav,
										Long cgdId){
			
		
			System.out.println("------------------>供应商删除"+cgdId);
			jhCgdService.delete(cgdId);
			
			mav.setViewName("redirect:cgdList.do");// 路径是：/WEB-INF/userslistpage.jsp
			return mav;
		}
	
	
}
