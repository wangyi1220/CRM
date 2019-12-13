package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.entity.SysUsers;
import com.sc.mapper.SysUsersMapper;

@Controller
@RequestMapping("/test")
public class test {
	
	@Autowired
	SysUsersMapper sysUsersMapper;
	
	@RequestMapping("/test1.do")
	@ResponseBody
	public void test1(){
		List<SysUsers> list = sysUsersMapper.selectByExample(null);
		for (SysUsers sysUsers : list) {
			System.out.println(sysUsers.getUsersName()+":"+sysUsers.getUsersPassword());
		}
//		SysUsers su=new SysUsers();
//		su.setUsersName("chengan");
//		su.setUsersPassword("123456");
//		sysUsersMapper.insert(su);
	}
	
}
