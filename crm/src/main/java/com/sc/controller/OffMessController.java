package com.sc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OffMess;
import com.sc.service.OffMessService;

@Controller
@RequestMapping("/offmessctrl")
public class OffMessController {
	
	@Autowired
	OffMessService offMessService;
	
	@RequestMapping("/messlist.do")
	public ModelAndView list(ModelAndView mav){
		System.out.println("查看用户列表");
		
		
		List<OffMess> list = this.offMessService.select();
		mav.addObject("list", list);
		mav.setViewName("messlist");//路径/WEB-INF/messlist.jsp
		return mav;
	}
	
	@RequestMapping("/listpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查看列表-分页");
		
		//查询list集合分页
		mav.addObject("p", offMessService.selectpage(pageNum, pageSize));
		
		mav.setViewName("OFF/mailbox");// 路径/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	@RequestMapping("/goadd.do")
	public ModelAndView goadd(ModelAndView mav){
		mav.setViewName("OFF/mail_compose");
		return mav;
	}
	
	@RequestMapping("/add.do")
	public ModelAndView add(ModelAndView mav,MultipartFile upload,HttpServletRequest req,
			OffMess m) throws IllegalStateException, IOException{
		System.out.println("开始发送短消息"+m);
		
		this.offMessService.add(m);
		mav.setViewName("redirect:listpage.do");//重定向到listpage方法
		return mav;
	}
	
	
	

}
