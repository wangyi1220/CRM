package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysCompanyinfo;
import com.sc.entity.SysPost;
import com.sc.entity.SysUserinfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysCompanyInfoService;
import com.sc.service.SysPostService;
import com.sc.service.SysUsersInfoService;

@Controller
@RequestMapping("/SysUsersInfoCtrl")
public class SysUserInfoCtroller {
	@Autowired
	SysUsersInfoService sysUsersInfoService;
	@Autowired
	SysCompanyInfoService sysCompanyInfoService;
	@Autowired
	SysPostService sysPostService;

	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10") Integer pageSize) {
			/*String iscg,SysUserinfo info,HttpServletRequest req*/
		/*System.out.println(info.getEmpId());
		System.out.println(info.getEmpName());
		HttpSession session = req.getSession();
		if(info.getEmpId()!=null||info.getEmpName()!=null){
			session.setAttribute("seluser", info);
		}
		PageInfo<SysUserinfo> sinfo = this.sysUsersInfoService.selectUserinfo2(pageNum, pageSize,(SysUsers)session.getAttribute("seluser") );
*/
		mav.addObject("p", sysUsersInfoService.select(pageNum, pageSize));
		/*if(iscg!=null){
			mav.addObject("iscg", "yes");
		}*/
		mav.setViewName("ssf/UserINFOlist");
		System.out.println(sysUsersInfoService.select(pageNum, pageSize));

		System.out.println("分页");

		return mav;
	}

	@RequestMapping("/goupdate.do")
	public ModelAndView goupdate(ModelAndView mav, SysUserinfo u) {
		System.out.println("进入goupdate方法" + u.getEmpId());
		SysUserinfo users = sysUsersInfoService.get(u.getEmpId());
		System.out.println("调用按empid查询信息后" + users);
		mav.addObject("u", users);
		mav.setViewName("ssf/updateINFO");

		return mav;
	}

	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav, MultipartFile upload, HttpServletRequest req, SysUserinfo u)
			throws IllegalStateException, IOException {
		System.out.println("开始上传文件" + u);

		// 如果用户选择文件，那么执行上传代码
		if (upload != null) {
			String filename = upload.getOriginalFilename();// 文件名
			if (filename != null && !filename.equals("")) {
				// 获取upload文件夹所在路径
				String path = req.getSession().getServletContext().getRealPath("upload");
				// 形如：26456456435.jpg
				filename = System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));
				// 目的地文件对象
				File file = new File(path + "/" + filename);
				upload.transferTo(file);// 转换存储文件

				// 设置图片名称
				u.setEmpPhoto(filename);
			}
		}
		u.setChangDate(new Date());
		this.sysUsersInfoService.update(u);
		System.out.println(u);
		mav.setViewName("redirect:listPage.do");// 重定向到list方法
		return mav;
	}

	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav, SysUserinfo s) {
		System.out.println("删除用户！" + s);
		this.sysUsersInfoService.delete(s);
		mav.setViewName("redirect:listPage.do");// 重定向到list方法
		return mav;
	}

	@RequestMapping("/goadd.do")
	public ModelAndView goadd(ModelAndView mav, SysUserinfo user) {
		System.out.println("开始查询");
		List<SysCompanyinfo> p = this.sysCompanyInfoService.selectlist();
		List<SysPost> q =this.sysPostService.selectlist();
		System.out.println("55555555555"+p+q);
		mav.addObject("p", p);
		mav.addObject("q", q);
		mav.setViewName("ssf/usersINFOadd");
		System.out.println("准备添加用户");
		return mav;
	}

	@RequestMapping("/add.do")
	public ModelAndView add(ModelAndView mav, MultipartFile upload, HttpServletRequest req, SysUserinfo u)
			throws IllegalStateException, IOException {
		System.out.println("开始添加用户" + u);

		// 如果用户选择文件，那么执行上传代码
		if (upload != null) {
			String filename = upload.getOriginalFilename();// 文件名
			if (filename != null && !filename.equals("")) {
				// 获取upload文件夹所在路径
				String path = req.getSession().getServletContext().getRealPath("upload");
				// 形如：26456456435.jpg
				filename = System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));
				// 目的地文件对象
				File file = new File(path + "/" + filename);
				upload.transferTo(file);// 转换存储文件

				// 设置图片名称
				u.setEmpPhoto(filename);
			}
		    u.setChangDate(new Date());
			sysUsersInfoService.add(u);
			mav.addObject("iscg", "yes");
			mav.setViewName("redirect:listPage.do");

		}
		return mav;
	}
	
}
