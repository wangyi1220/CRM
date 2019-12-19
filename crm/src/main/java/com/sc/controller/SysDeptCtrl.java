package com.sc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysDept;
import com.sc.service.SysDeptService;

@Controller
@RequestMapping("/SyDeptCtrl")
public class SysDeptCtrl {
	@Autowired
	SysDeptService sysDeptService;
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="3")Integer pageSize){
		
		mav.addObject("p", sysDeptService.select(pageNum, pageSize));
		mav.setViewName("ssf/DEPTlistpage");
		System.out.println(sysDeptService.select(pageNum, pageSize));
		
		System.out.println("分页");
		
		return mav;
	}

	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav, SysDept s) {
		System.out.println("删除用户！" + s);
		this.sysDeptService.del(s);
		mav.setViewName("redirect:listPage.do");// 重定向到list方法
		return mav;
	}
	@RequestMapping("/goupdate.do")
	public ModelAndView goupdate(ModelAndView mav, SysDept u) {
		System.out.println("进入goupdate方法" + u.getDeptId());
		SysDept p = sysDeptService.get(u.getDeptId());
		System.out.println("调用deptId查询信息后" + p);
		mav.addObject("u", p);
		mav.setViewName("ssf/updateDEPT");

		return mav;
	}
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav, HttpServletRequest req, SysDept u)
			throws IllegalStateException, IOException {
		System.out.println("进入修改方法");

		this.sysDeptService.update(u);
		System.out.println("修改成功！"+u);
		mav.setViewName("redirect:listPage.do");// 重定向到list方法
		return mav;
	}

	@RequestMapping("/goadd.do")
	public ModelAndView goadd(ModelAndView mav, SysDept user) {

		mav.setViewName("ssf/DEPTadd");
		return mav;
	}
	@RequestMapping("/add.do")
	public ModelAndView add(ModelAndView mav, MultipartFile upload, HttpServletRequest req, SysDept u)
			throws IllegalStateException, IOException {
		System.out.println("开始添加用户" + u);

		sysDeptService.add(u);
		mav.setViewName("redirect:listPage.do");

		return mav;
	}
}
