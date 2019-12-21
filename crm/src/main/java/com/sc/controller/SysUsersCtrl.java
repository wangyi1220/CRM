package com.sc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysUsersRoleService;
import com.sc.service.SysUsersService;

@Controller
@RequestMapping("/SysUsersCtrl")
public class SysUsersCtrl {
	
	@Autowired
	SysUsersService sysUsersService;
	@Autowired
	SysUsersRoleService sysUsersRoleService;
	
//	@RequestMapping("/goupdate.do")
//	public ModelAndView goupdate(ModelAndView mav,SysUsers user){
//		System.out.println("跳转到修改页面！"+user);
//		
//		SysUsers users = this.sysUsersService.get(user.getUsersId());
//		mav.addObject("user", user);
//		mav.setViewName("usersupdate");
//		return mav;
//	}
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="7")Integer pageSize){
		
		mav.addObject("p", sysUsersService.select(pageNum, pageSize));
		mav.setViewName("ssf/userslistpage");
		System.out.println(sysUsersService.select(pageNum, pageSize));
		System.out.println("分页");
		
		return mav;
	}
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav,
			HttpServletRequest req,
			SysUsers u) throws IllegalStateException, IOException{
	
		this.sysUsersService.update(u);
		mav.setViewName("redirect:list.do");//重定向到list方法
		return mav;
	}

	@RequestMapping("/userList.do")
	public ModelAndView userList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="7")Integer pageSize,SysUsers users,String isdel){
		
		System.out.println(users.getUsersId());
		System.out.println(users.getUsersName());
		PageInfo<SysUsers> info = this.sysUsersService.selectUserinfo2(pageNum, pageSize, users);
		if(isdel!=null){
			mav.addObject("isdel", "yes");
		}
		mav.addObject("u", info);
		mav.setViewName("wangyi/userlist");
		return mav;
	}
	
	@RequestMapping("/deleteUser.do")
	public ModelAndView deleteUser(ModelAndView mav,SysUsers user,Long[] delid){
		System.out.println("要删除的用户id为"+user.getUsersId());
		this.sysUsersService.deleteUser(user);
		this.sysUsersRoleService.deleteByuId(user.getUsersId());
		if(delid!=null&&delid.length>0){
			for (Long long1 : delid) {
				user.setUsersId(long1);
				System.out.println(long1);
				System.out.println("要删除的用户id为"+user.getUsersId());
				this.sysUsersService.deleteUser(user);
				this.sysUsersRoleService.deleteByuId(user.getUsersId());
			}
		}
		mav.setViewName("redirect:userList.do?isdel=yes");
		return mav;
	}
}
