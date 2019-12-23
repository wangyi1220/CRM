package com.sc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffMess;
import com.sc.entity.OffMessdeta;
import com.sc.service.OffMessdetaService;

@Controller
@RequestMapping("/offmessdetactrl")
public class OffMessdetaController {
	
	@Autowired
	OffMessdetaService offMessdetaService;
	
	
	//模糊查询收件箱
	@RequestMapping("/sousuod.do")
	public ModelAndView sousuo(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize,
			HttpServletRequest req){
		String starch = req.getParameter("search");
		System.out.println("进入搜索方法！"+starch);
		PageInfo<OffMessdeta> dd = offMessdetaService.sousuod(pageNum, pageSize, 1L, starch);
		
		
		//查询list集合分页
		mav.addObject("p", dd);
		mav.setViewName("OFF/mailboxs");// 路径/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav,Long did){
		System.out.println("删除");
		this.offMessdetaService.delete(did);
		mav.setViewName("redirect:listpagedeta.do");//重定向到listpage方法
		return mav;
     }
	
	
	//查看消息详情
	@RequestMapping("/details.do")
	public ModelAndView details(ModelAndView mav,Long did){
		System.out.println("查看消息详情"+did);
		OffMessdeta vv = offMessdetaService.getbyid(did);
		System.out.println(vv);
		vv.setMessstate("已查看");
		offMessdetaService.update(vv);
		
		
		OffMessdeta mdeta = this.offMessdetaService.get(did);
		mav.addObject("m", mdeta);
		mav.setViewName("OFF/mail_detail");
		
		return mav;
	}
	
	@RequestMapping("/messlist.do")
	public ModelAndView list(ModelAndView mav){
		System.out.println("查看用户列表");
		
		
		List<OffMessdeta> list = this.offMessdetaService.select();
		mav.addObject("list", list);
		mav.setViewName("messlist");//路径/WEB-INF/messlist.jsp
		return mav;
	}
	
	@RequestMapping("/listpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查看列表-分页");
		
		//查询list集合分页
		mav.addObject("p", offMessdetaService.selectpage(pageNum, pageSize));
		
		mav.setViewName("OFF/mailbox");// 路径/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	@RequestMapping("/goadd.do")
	public ModelAndView goadd(ModelAndView mav){
		mav.setViewName("OFF/mail_compose");
		return mav;
	}
	
	@RequestMapping("/add.do")
	public ModelAndView add(ModelAndView mav,MultipartFile upload,HttpServletRequest req,
			OffMessdeta md) throws IllegalStateException, IOException{
		System.out.println("开始发送短消息"+md);
		
		this.offMessdetaService.add(md);
		mav.setViewName("redirect:listpage.do");//重定向到listpage方法
		return mav;
	}
	
	@RequestMapping("/listpagedeta.do")
	public ModelAndView listpagedeta(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查看列表-分页");
		
		//查询list集合分页
		mav.addObject("p", offMessdetaService.selectdeta(pageNum, pageSize, 1L));
		
		mav.setViewName("OFF/mailboxs");// 路径/WEB-INF/OFF/mailbox.jsp
		return mav;
	}

}
