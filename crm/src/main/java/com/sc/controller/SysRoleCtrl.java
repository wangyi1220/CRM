package com.sc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysRole;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersRole;
import com.sc.service.SysRoleService;
import com.sc.service.SysUsersRoleService;
import com.sc.service.SysUsersService;

@Controller
@RequestMapping("/SysRoleCtrl")
public class SysRoleCtrl {
	
	@Autowired
	SysRoleService sysRoleService;
	@Autowired
	SysUsersService sysUsersService;
	
	@Autowired
	SysUsersRoleService sysUsersRoleService;
	
	@RequestMapping("/goaddRole.do")
	public ModelAndView goaddRole(ModelAndView mav){
		List<SysRole> list = this.sysRoleService.selectAll();
		List<SysRole> list1=null;
		mav.addObject("r", list);
		mav.setViewName("wangyi/addrole");
		return mav;
	}
	
	@RequestMapping("/addRole.do")
	public ModelAndView addRole(ModelAndView mav,SysRole sr){
		sr.setChangeDate(new Date());
		this.sysRoleService.addRole(sr);
		mav.addObject("issuc", "yes");
		mav.setViewName("wangyi/addrole");
		return mav;
	}
	
	@RequestMapping("/roleList.do")
	public ModelAndView roleListe(ModelAndView mav){
		List<SysRole> list = new ArrayList<SysRole>();
		List<Long> list1=new ArrayList<Long>();
		long uId=61L;
		SysUsers user = this.sysUsersService.selectRole(uId);
		long sId=user.getSysRole().getRoleId();
		list1.add(sId);
		for (int i = 0; i < list1.size(); i++) {
			List<SysRole> sonList = this.sysRoleService.selectBySuperId(list1.get(i));
			for (SysRole sysRole : sonList) {
				list1.add(sysRole.getRoleId());
			}
		}
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
			SysRole role = this.sysRoleService.selectMeAndSuper(list1.get(i));
			
			SysUsers userinfo = this.sysUsersService.selectUserinfo(role.getOperaterId());
			role.setOperaterName(userinfo.getSysUserinfo().getEmpName());
			
			list.add(role);
		}
		System.out.println(list.size());
		for (SysRole role : list) {
			if(role.getSysRole()!=null){
				System.out.println(role.toString()+":"+role.getSysRole().toString());
			}
			
		}
		mav.addObject("r", list);
		mav.setViewName("wangyi/roleList");
		return mav;
	}
	
	@RequestMapping("/sonRoleList.do")
	public ModelAndView sonRoleListe(ModelAndView mav,Long rid){
		List<SysRole> list = new ArrayList<SysRole>();
		List<Long> list1=new ArrayList<Long>();
		list1.add(rid);
		for (int i = 0; i < list1.size(); i++) {
			List<SysRole> sonList = this.sysRoleService.selectBySuperId(list1.get(i));
			for (SysRole sysRole : sonList) {
				list1.add(sysRole.getRoleId());
			}
		}
		list1.remove(0);
		System.out.println(list1.size());
		for (int i = 0; i < list1.size(); i++) {
			SysRole role = this.sysRoleService.selectMeAndSuper(list1.get(i));
			
			SysUsers userinfo = this.sysUsersService.selectUserinfo(role.getOperaterId());
			role.setOperaterName(userinfo.getSysUserinfo().getEmpName());
			
			list.add(role);
		}
		System.out.println(list.size());
		for (SysRole role : list) {
			if(role.getSysRole()!=null){
				System.out.println(role.toString()+":"+role.getSysRole().toString());
			}
			
		}
		
		mav.addObject("isson", "yes");
		mav.addObject("r", list);
		mav.setViewName("wangyi/roleList");
		return mav;
	}
	
	@RequestMapping("/selectUsers.do")
	public ModelAndView selectUsers(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,Long roleId){
		
		mav.addObject("ru", this.sysRoleService.selectUsers(pageNum, pageSize, roleId));
		mav.setViewName("wangyi/roleuserlist");
		return mav;
	}
	
	@RequestMapping("/selectUsersAndNORoleUser.do")
	public ModelAndView selectUsersAndNORoleUser(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,Long rId){
		Long roleId=61l;
		mav.addObject("rId", rId);
		mav.addObject("uis", this.sysRoleService.selectUsersAndNORoleUser(pageNum, pageSize, roleId));
		mav.setViewName("wangyi/adduserinrole");
		return mav;
		
	}
	
	@RequestMapping("/addUserForRole.do")
	public ModelAndView addUserForRole(ModelAndView mav,Long[] uIds,Long rId){
		List<SysUsers> list = this.sysUsersService.selectNoRoleUser();
		SysUsersRole sur = new SysUsersRole();
		sur.setRoleId(rId);
		sur.setChangeDate(new Date());
		for (int i = 0; i < uIds.length; i++) {
			int j=0;
			for (SysUsers sysUsers : list) {
				if(uIds[i]==sysUsers.getUsersId()){
					j=j+1;
				}
			}
			if(j==0){
				sur.setUsersId(uIds[i]);
				this.sysUsersRoleService.update(sur);
			}else{
				sur.setUsersId(uIds[i]);
				this.sysUsersRoleService.insert(sur);
			}
		}
		return null;
	}
}
