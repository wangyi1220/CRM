package com.sc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysPowerRole;
import com.sc.entity.SysRole;
import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersRole;
import com.sc.service.SysPowerRoleService;
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
	
	@Autowired
	SysPowerRoleService sysPowerRoleService;
	
	
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
		sr.setOperaterId(61L);
		this.sysRoleService.addRole(sr);
		mav.addObject("issuc", "yes");
		mav.setViewName("wangyi/addrole");
		return mav;
	}
	
	@RequestMapping("/roleList.do")
	public ModelAndView roleListe(ModelAndView mav,String addsuc,String updatesuc,String delsuc){
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
		System.out.println("�Լ����ӽ�ɫ������"+list1.size());
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
		if(addsuc!=null){
			mav.addObject("addsuc", "yes");
		}
		if(updatesuc!=null){
			mav.addObject("updatesuc", "yes");
		}
		if(delsuc!=null){
			mav.addObject("delsuc", "yes");
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
				SysUsersRole sysUsersRole = this.sysUsersRoleService.selectByUId(uIds[i]);
				sur.setSurId(sysUsersRole.getSurId());
				sur.setUsersId(uIds[i]);
				this.sysUsersRoleService.update(sur);
			}else{
				sur.setUsersId(uIds[i]);
				this.sysUsersRoleService.insert(sur);
			}
		}
		
		mav.setViewName("redirect:roleList.do?addsuc=yes");
		return mav;
	}
	
	@RequestMapping("/goUpdatePower.do")
	public ModelAndView goUpdatePower(ModelAndView mav,Long rId){
		
		mav.addObject("rId", rId);
		mav.addObject("p", this.sysRoleService.selectRolePower(rId));
		mav.setViewName("wangyi/updatepower");
		return mav;
		
	}
	
	@RequestMapping("/updatePower.do")
	public ModelAndView updatePower(ModelAndView mav,Long[] pIds,Long rId){
		List<SysPowerRole> list = this.sysPowerRoleService.selectByrId(rId);
		System.out.println(list.size());
		SysPowerRole sysPowerRole=new SysPowerRole();
		sysPowerRole.setRoleId(rId);
		sysPowerRole.setChangeDate(new Date());
		if(list!=null&&list.size()>0){
			
			for (SysPowerRole spr : list) {
				int j=0;
				for (int i = 0; i < pIds.length; i++) {
					if(spr.getPowerId()==pIds[i]){
						j=j+1;
						break;
					}
				}
				if(j==0){
					this.sysPowerRoleService.delete(spr);
				}
			}
			for (int i = 0; i < pIds.length; i++) {
				int z=0;
				for (SysPowerRole spr : list) {
					if(pIds[i]==spr.getPowerId()){
						z=z+1;
						break;
					}
				}
				if(z==0){
					sysPowerRole.setPowerId(pIds[i]);
					this.sysPowerRoleService.insert(sysPowerRole);
				}
			}
		}else{
			for (Long pId : pIds) {
				sysPowerRole.setPowerId(pId);
				this.sysPowerRoleService.insert(sysPowerRole);
			}
		}
		mav.setViewName("redirect:roleList.do?updatesuc=yes");
		return mav;
	}
	
	@RequestMapping("/goDeleteRole.do")
	public ModelAndView goDeleteRole(ModelAndView mav,Long rId){
		SysRole role = this.sysRoleService.selectByPK(rId);
		List<SysRole> list=null;
		if(role.getSuperRoleId()!=null){
			list = this.sysRoleService.selectBySuperId(role.getSuperRoleId());
			for (int i = 0; i < list.size(); i++) {
				if(role.getRoleId()==list.get(i).getRoleId()){
					list.remove(i);
				}
			}
		}
		mav.addObject("tj", list);
		mav.addObject("r", role);
		mav.setViewName("wangyi/deleterole");
		return mav;
	}
	@RequestMapping("/deleteRole.do")
	public ModelAndView deleteRole(ModelAndView mav,String radio2,Long tjrid,Long delrid){
		System.out.println("ѡ�"+radio2);
		System.out.println("ͬ����ɫid��"+tjrid);
		System.out.println("ɾ����ɫid��"+delrid);
		if(radio2.equals("0")){
			this.sysPowerRoleService.deleteByrId(delrid);
			this.sysUsersRoleService.deleteByrId(delrid);
			this.sysRoleService.deleteBypk(delrid);
		}
		
		mav.setViewName("redirect:roleList.do?delsuc=yes");
		return mav;
	}
}
