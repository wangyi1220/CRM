package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OfficeKpi;
import com.sc.entity.OfficeTaskAssessment;
import com.sc.service.OfficeKpiService;
import com.sc.service.OfficeTaskAssessmentService;

@Controller
@RequestMapping("/OfficeKpictrl")
public class OfficeKpiController {
	@Autowired 
	OfficeKpiService OfficeKpiService ;
	@Autowired 
	OfficeTaskAssessmentService OfficeTaskAssessmentService;
    @RequestMapping("/list.do")
		public ModelAndView list(ModelAndView mav){
			
			List<OfficeKpi> list = this.OfficeKpiService.select();
			mav.addObject("list", list);
			mav.setViewName("OA/OfficeKpilistpage");// /WEB-INF/userslist.jsp
			return mav;
		}
	 //@RequestMapping("/delete.do")
	 
	
	 @RequestMapping("/listpage.do")
	   public ModelAndView listpage(ModelAndView mav,@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="5") Integer pageSize){
		System.out.println("----");
		
		mav.addObject("p",OfficeKpiService.selectpage(pageNum,pageSize));
		
		mav.setViewName("OA/OfficeKpilistpage");
		return mav;
		}
	 
	
	 @RequestMapping("/delete.do")
		public ModelAndView delete(ModelAndView mav,OfficeKpi k){
			System.out.println("删除考核指标！"+k);
			this.OfficeKpiService.delete(k);
			mav.setViewName("redirect:listpage.do");//重定向到list方法
			return mav;
		}
	 @RequestMapping("/goupdate.do")
	 public ModelAndView goupdate(ModelAndView mav,BigDecimal kpiId){
			System.out.println("修改之前先查看");
			mav.addObject("kpi", OfficeKpiService.get(kpiId));
			mav.setViewName("OA/OfficeKpigoupdate");
			return mav;
		}
	 @RequestMapping("OfficeKpiupdate.do")
	 public ModelAndView OfficeKpiupdate(ModelAndView mav,OfficeKpi kpi){
		 kpi.setFinalUpdataTime(new Date());
		 System.out.println("修该考核任务"+kpi);
		this.OfficeKpiService.update(kpi);
		 mav.setViewName("redirect:listpage.do");
		 return mav;
	 }
	 @RequestMapping("/addofficeKpi.do")
	 public ModelAndView addofficeKpi(ModelAndView mav,OfficeKpi k,OfficeTaskAssessment t){
		  k.setFinalUpdataTime(new Date());
		  t.setFinalUpdateTime(k.getFinalUpdataTime());
		 t.setCompanyId(k.getCompanyId());
		 t.setTaskKpi(k.getKpiKpi());
		  System.out.println("添加考核任务"+k);
		  this.OfficeKpiService.add(k);
		  this.OfficeTaskAssessmentService.add(t);
		 mav.setViewName("redirect:listpage.do");
		 return mav;
		 }
	 @RequestMapping("/inaddofficeKpi.do")
		public ModelAndView inaddofficeKpi(ModelAndView mav){
			mav.setViewName("OA/addofficeKpi");
			return mav;
			}
}
