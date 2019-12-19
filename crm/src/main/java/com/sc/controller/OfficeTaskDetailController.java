package com.sc.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.sc.entity.OfficeTaskDetail;
import com.sc.service.OfficeTaskDetailService;

@Controller
@RequestMapping("/OfficeTaskDetailController")
public class OfficeTaskDetailController {
	@Autowired  OfficeTaskDetailService  OfficeTaskDetailService;
	@RequestMapping("/list.do")
	public ModelAndView list(ModelAndView mav){
		
		List<OfficeTaskDetail> list = this.OfficeTaskDetailService.select();
		mav.addObject("list", list);
		mav.setViewName("OA/OfficeTaskDetaillistpage");// /WEB-INF/userslist.jsp
		return mav;
	}
	@RequestMapping("/listpage.do")
	public ModelAndView listpage(ModelAndView mav,@RequestParam(defaultValue="1") Integer pageNum,
		@RequestParam(defaultValue="5") Integer pageSize){
		System.out.println("----");
		mav.addObject("p",OfficeTaskDetailService.selectpage(pageNum,pageSize));
		mav.setViewName("OA/OfficeTaskDetaillistpage");
		return mav;
		}
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav,OfficeTaskDetail d)
	{
		System.out.println("删除考核任务详情");
		this.OfficeTaskDetailService.delete(d);
		mav.setViewName("redirect:listpage.do");
		return mav;
	}
	@RequestMapping("/goupdate.do")
	 public ModelAndView goupdate(ModelAndView mav,BigDecimal taskDetailId){
			System.out.println("修改之前先查看");
			mav.addObject("d", OfficeTaskDetailService.get(taskDetailId));
			mav.setViewName("OA/OfficeTaskDetailgoupdate");
			return mav;
		}
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav,OfficeTaskDetail d,String status1)
	{
	d.setFinalUpdataTime(new Date());
	 System.out.println("修改考核任务详情"+d);
	 d.setStatus(status1);
	 this.OfficeTaskDetailService.update(d);
	 mav.setViewName("redirect:listpage.do");
      return mav;
     }
	@RequestMapping("/select.do")
	public ModelAndView select(ModelAndView mav,OfficeTaskDetail d)
	{
		OfficeTaskDetail list1=this.OfficeTaskDetailService.get1(d.getTaskId());
		System.out.println("------"+list1);
		mav.addObject("d", list1);
		mav.setViewName("OA/OfficeTaskDetail");
		
		return mav;
	}
	
}
