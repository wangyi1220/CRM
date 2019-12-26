package com.sc.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OOfficePerSche;
import com.sc.entity.SysUsers;
import com.sc.service.HR_PerAgendaService;

@Controller
@Scope("prototype")
@RequestMapping("schedule")
public class HR_ScheduleCtrl {
   
	@Resource
	private HR_PerAgendaService hR_PerAgendaServiceImp;
	@Autowired
	HttpSession httpSession;
	
	
			
	
	
			// 个人日程列表（分页查询）
			@RequestMapping("/list.do") //请求路径是schedule/list.action
			@ResponseBody
			public List list(OOfficePerSche sche,HttpSession session){
				System.out.println("start:"+sche.getStart()+"-----end:"+sche.getEnd());
				/*UserSession loginUser=(UserSession) session.getAttribute("loginUser");
				sche.setUid(loginUser.getsUserAccount().getSuaId());
				sche.setCid(loginUser.getsUserAccount().getScId());*/
				
				//---需要获取用户id和公司id---start
				SysUsers user =(SysUsers)this.httpSession.getAttribute("nowuser");
				sche.setUid(user.getUsersId().toString());
				sche.setCid(user.getCompanyId().toString());
				//---需要获取用户id和公司id---end
				
				System.out.println("=====对象信息list====="+sche);
				List list = hR_PerAgendaServiceImp.getAllSchedule(sche);
				System.out.println(list);
				return list;
			}
			
			
			@RequestMapping("/addsche.do")
			@ResponseBody
			public String addsche(@RequestBody OOfficePerSche sche,HttpSession session){
				System.out.println("=====对象信息add====="+sche);
				
				/*UserSession loginUser=(UserSession) session.getAttribute("loginUser");
				sche.setUid(loginUser.getsUserAccount().getSuaId());
				sche.setCid(loginUser.getsUserAccount().getScId());*/
				
				//---需要获取用户id和公司id---start
				SysUsers user =(SysUsers)this.httpSession.getAttribute("nowuser");
				sche.setUid(user.getUsersId().toString());
				sche.setCid(user.getCompanyId().toString());
				//---需要获取用户id和公司id---end
				
				sche.setAllDay("0");
				sche.setTopic("dasd");//主题暂时为'dasd'
				sche.setLasttime(new Date().toLocaleString());
				
				hR_PerAgendaServiceImp.addSchedule(sche);
				System.out.println("---Id:"+sche.getId());
				
				return sche.getId();
			}
			
			
			@RequestMapping("/updatesche.do")
			@ResponseBody
			public void updatesche(@RequestBody OOfficePerSche sche,HttpSession session){
				System.out.println("=====对象信息update====="+sche);
				
				/*UserSession loginUser=(UserSession) session.getAttribute("loginUser");
				sche.setUid(loginUser.getsUserAccount().getSuaId());
				sche.setCid(loginUser.getsUserAccount().getScId());*/
				
				//---需要获取用户id和公司id---start
				SysUsers user =(SysUsers)this.httpSession.getAttribute("nowuser");
				sche.setUid(user.getUsersId().toString());
				sche.setCid(user.getCompanyId().toString());
				//---需要获取用户id和公司id---end
				
				sche.setAllDay("0");
				sche.setTopic("dasd");//主题暂时为'dasd'
				sche.setLasttime(new Date().toLocaleString());
				
				hR_PerAgendaServiceImp.updateSchedule(sche);
				
			}
			
			@RequestMapping("/deletesche.do")
			@ResponseBody
			public void deletesche(@RequestBody OOfficePerSche sche){
				System.out.println("=====对象信息delete====="+sche);
				hR_PerAgendaServiceImp.delSchedule(sche);
			}
			
			
		}
