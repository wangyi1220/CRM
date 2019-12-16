package com.sc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysUserinfo;
import com.sc.service.SysUsersInfoService;

@Controller
@RequestMapping("/SysUsersInfoCtrl")
public class SysUserInfoCtroller {
	@Autowired
	SysUsersInfoService sysUsersInfoService;

	
	
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="12")Integer pageSize){
		
		mav.addObject("p", sysUsersInfoService.select(pageNum, pageSize));
		mav.setViewName("ssf/userinfopage");
		System.out.println(sysUsersInfoService.select(pageNum, pageSize));
		
		System.out.println("分页");
		
		return mav;
	}
	@RequestMapping("/goupdate.do")
	public ModelAndView goupdate(ModelAndView mav,SysUserinfo u){
		System.out.println("跳转到修改页面！"+u);
		SysUserinfo users = this.sysUsersInfoService.get(u.getEmpId());
		mav.addObject("u", users);
		mav.setViewName("usersupdate");
		return mav;
	}
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav,
			MultipartFile upload,
			HttpServletRequest req,
			SysUserinfo u) throws IllegalStateException, IOException{
		System.out.println("开始上传文件"+u);
		
		//如果用户选择文件，那么执行上传代码
		if(upload!=null){
			String filename=upload.getOriginalFilename();//文件名
			if(filename!=null&&!filename.equals("")){
				//获取upload文件夹所在路径
				String path=req.getSession().
						getServletContext().getRealPath("upload");
				//形如：26456456435.jpg
				filename=System.currentTimeMillis()
						+filename.substring(filename.lastIndexOf("."));
				//目的地文件对象
				File file=new File(path+"/"+filename);
				upload.transferTo(file);//转换存储文件
				
				//设置图片名称
				u.setEmpPhoto(filename);
			}
		}
		
		this.sysUsersInfoService.update(u);
		mav.setViewName("redirect:listPage.do");//重定向到list方法
		return mav;
	}


}
