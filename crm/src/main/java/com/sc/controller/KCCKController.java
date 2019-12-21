package com.sc.controller;

import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.KcCangku;
import com.sc.entity.OfficeKpi;
import com.sc.service.KcCangkuService;

@Controller
@RequestMapping("/KCCKControllerCtrl")//KCCK--仓库库存
public class KCCKController {
	
	@Autowired
	KcCangkuService kcCangkuService;
	//分页查询
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,KcCangku kcck){
		
		mav.addObject("p", kcCangkuService.select(pageNum, pageSize,kcck));
		//跳转页面
		mav.setViewName("yjs/selectKCCKPage");
		
		System.out.println("分页");
		
		return mav;
	}
	
	//添加
	 @RequestMapping("/add.do")//去添加
	 public ModelAndView addofficeKpi(ModelAndView mav){
		
		 mav.setViewName("yjs/addKCCKPage");
		 return mav;
		 }
	 
	 @RequestMapping("/addKCCK.do")//执行添加
	 public ModelAndView addofficeKpi(ModelAndView mav,KcCangku kcck){
		kcck.setCangkuLastModifyTime(new Date());
		 System.out.println("添加考仓库"+kcck);
		this.kcCangkuService.add(kcck);
		 mav.setViewName("redirect:listPage.do");
		 return mav;
		 }
	 //删除
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav, Long kcck){
		System.out.println("删除仓库！"+kcck);
		kcCangkuService.delete(kcck);
		mav.setViewName("redirect:listPage.do");//重定向到list方法
		return mav;
	}
	
	//选中删除
	@RequestMapping("/kcckDeleteSelect.do")
	public ModelAndView kcgsDeleteSelect(ModelAndView mav,
									HttpServletRequest req,
									HttpServletResponse resp){
		
		String[] idsArr = req.getParameterValues("ckid");
		System.out.println("------进入删除选中1:>"+idsArr.length);
		for (String gidStr : idsArr) {
			System.out.println("--------进入删除选中2：>"+gidStr);
			Long gid = Long.parseLong(gidStr);
			
			System.out.println("--------进入删除选中3：>"+gid);
			kcCangkuService.delete(gid);
		}
		
		mav.setViewName("redirect:listPage.do");
		return mav;
	}
	//修改
	 @RequestMapping("/goupdate.do")
	 public ModelAndView goupdate(ModelAndView mav,Long cangkuId ){
			System.out.println("进入了goupdate");
			mav.addObject("kcck", kcCangkuService.getCkID(cangkuId));
			mav.setViewName("yjs/updateKCCKPage");
			return mav;
		}
	 @RequestMapping("/update.do")
	 public ModelAndView OfficeKpiupdate(ModelAndView mav,KcCangku kcck){
		 kcck.setCangkuLastModifyTime(new Date());
		 System.out.println("修改仓库信息"+kcck);
		this.kcCangkuService.update(kcck);
		 mav.setViewName("redirect:listPage.do");
		 return mav;
	 }
	
}
