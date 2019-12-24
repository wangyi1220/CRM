package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysLog;
import com.sc.service.SysLogService;

@Controller
@RequestMapping("/SysLogCtrl")
public class SysLogCtrl {
	@Autowired
	SysLogService sysLogService;
	@RequestMapping("/selectLog.do")
	public ModelAndView selectLog(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="7")Integer pageSize,SysLog log,String isdel,String isall,
			HttpServletRequest req){
		System.out.println("isall为："+isall);
		HttpSession session = req.getSession();
		PageInfo<SysLog> info=null;
		if(log.getUserId()!=null||log.getVisitDate()!=null){
			session.setAttribute("logExample", log);
		}
		if(isall!=null&&isall.equals("yes?v=4.0")){
			log.setUserId(null);
			log.setVisitDate(null);
			session.setAttribute("logExample", log);
			System.out.println("全部");
			info = this.sysLogService.selectPage(pageNum, pageSize, (SysLog)session.getAttribute("logExample"));
		}else{
			System.out.println("部分");
			info = this.sysLogService.selectPage(pageNum, pageSize, (SysLog)session.getAttribute("logExample"));
		}
		
		if(isdel!=null){
			mav.addObject("isdel", "yes");
		}
		mav.addObject("l", info);
		mav.setViewName("wangyi/loglist");
		return mav;
	}
	
	@RequestMapping("/deleteLog.do")
	public ModelAndView deleteLog(ModelAndView mav,SysLog log,Long[] delid){
		if(log.getLogId()!=null){
			this.sysLogService.deleteLog(log.getLogId());
		}else{
			for (Long long1 : delid) {
				this.sysLogService.deleteLog(long1);
			}
		}
		
		mav.setViewName("redirect:selectLog.do?isdel=yes");
		return mav;
	}
	
	@RequestMapping("/deleteAll.do")
	public ModelAndView deleteAll(ModelAndView mav){
		this.sysLogService.deleteAll();
		mav.setViewName("redirect:selectLog.do?isdel=yes");
		return mav;
	}
}
