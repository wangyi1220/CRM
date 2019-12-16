package com.sc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OfficeKpi;
import com.sc.entity.OfficeTaskAssessment;
import com.sc.service.OfficeTaskAssessmentService;
@Controller
@RequestMapping("/OfficeTaskAssessmentController")
public class OfficeTaskAssessmentController {
	  @Autowired 
	OfficeTaskAssessmentService OfficeTaskAssessmentService;
    @RequestMapping("/list.do")
    public ModelAndView list(ModelAndView mav){
    	List<OfficeTaskAssessment> list = this.OfficeTaskAssessmentService.select();
		mav.addObject("list", list);
		mav.setViewName("OA/OfficeTaskAssessmentListpage");// /WEB-INF/userslist.jsp
    	return mav;
    }
    @RequestMapping("/listpage.do")
	   public ModelAndView listpage(ModelAndView mav,@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="5") Integer pageSize){
		System.out.println("----");
		
		mav.addObject("p",OfficeTaskAssessmentService.selectpage(pageNum,pageSize));
		
		mav.setViewName("OA/OfficeTaskAssessmentListpage");
		return mav;
		}
    //分页查询
    @RequestMapping("/delete.do")
    public ModelAndView delete(ModelAndView mav,OfficeTaskAssessment t){
    	System.out.println("删除任务"+t);
    	this.OfficeTaskAssessmentService.delete(t);
		mav.setViewName("redirect:listpage.do");//重定向到list方法
    	return mav;
    }
    @RequestMapping("/inaddOfficeTaskAssessment.do")
	public ModelAndView inaddofficeKpi(ModelAndView mav){
		mav.setViewName("OA/addOfficeTaskAssessment");
		return mav;
		}
    @RequestMapping("/add.do")
    public ModelAndView add(ModelAndView mav,OfficeTaskAssessment t){
    	System.out.println("添加新的任务"+t);
    	 Date d1=t.getTaskStartTime();
    	 SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    	 String format = format1.format(d1);

    	 
    	 Date d2=t.getTaskStopTime();
    	 SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
    	 format2.format(d2);
    	 
    	t.setFinalUpdateTime(new Date());
    	this.OfficeTaskAssessmentService.add(t);
    	mav.setViewName("redirect:listpage.do");//重定向到list方法
    	return mav;
    }
    
    @RequestMapping("/update.do")
    public ModelAndView update(ModelAndView mav,OfficeTaskAssessment t){
    	System.out.println("添加新的任务"+t);
    	this.OfficeTaskAssessmentService.update(t);
    	mav.setViewName("redirect:listpage.do");//重定向到list方法
    	return mav;
    }
}
