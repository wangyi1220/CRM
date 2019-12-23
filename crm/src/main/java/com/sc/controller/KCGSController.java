package com.sc.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.KcCangku;
import com.sc.entity.KcGoods;
import com.sc.service.KcGoodsService;

@Controller
@RequestMapping("/KCGSControllerCtrl")//类的路径
public class KCGSController {//KCGS--库存商品
	
	@Autowired
	KcGoodsService kcGoodsService;
	//分页查询--所有
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize,KcGoods kcgs){
		
		mav.addObject("p", kcGoodsService.select(pageNum, pageSize,kcgs));
		//跳转到库存商品信息表页面
		mav.setViewName("yjs/selectKCGSPage");
		
		System.out.println("分页--KCGS");
		
		return mav;
	}
	
	    //去添加
		 @RequestMapping("/add.do")//去页面转一圈
		 public ModelAndView addofficeKpi(ModelAndView mav){
			 mav.setViewName("yjs/addKCGSPage");
			 return mav;
		 }
		//真正添加的
		 @RequestMapping("/addKCGS.do")
		 public ModelAndView addKCGS(ModelAndView mav,KcGoods kcgs){
			 kcgs.setLastModifyTime(new Date());
			 System.out.println("添加库存商品信息"+kcgs);
			this.kcGoodsService.add(kcgs);
			 mav.setViewName("redirect:listPage.do");
			 return mav;
			 }
		 
		 //删除
		@RequestMapping("/delete.do")
		public ModelAndView delete(ModelAndView mav, Long kcgs){
			System.out.println("删除库存商品信息！"+kcgs);
			this.kcGoodsService.delete(kcgs);
			mav.setViewName("redirect:listPage.do");//重定向到list方法
			return mav;
		}
		
		//选中删除
				@RequestMapping("/kcgsDeleteSelect.do")
				public ModelAndView kcgsDeleteSelect(ModelAndView mav,
												HttpServletRequest req,
												HttpServletResponse resp){
					
					String[] idsArr = req.getParameterValues("gid");
					System.out.println("------进入删除选中1:>"+idsArr.length);
					for (String gidStr : idsArr) {
						System.out.println("--------进入删除选中2：>"+gidStr);
						Long gid = Long.parseLong(gidStr);
						
						System.out.println("--------进入删除选中3：>"+gid);
						kcGoodsService.delete(gid);
					}
					
					mav.setViewName("redirect:listPage.do");
					return mav;
				}
				
		//修改
		 @RequestMapping("/goupdate.do")
		 public ModelAndView goupdate(ModelAndView mav,Long gid ){
				System.out.println("进入了goupdate");
				mav.addObject("kcgs", kcGoodsService.getGsID(gid));
				mav.setViewName("yjs/updateKCGSPage");
				return mav;
			}
		 @RequestMapping("/update.do")
		 public ModelAndView OfficeKpiupdate(ModelAndView mav,KcGoods kcgs){
			/* kcck.setCangkuLastModifyTime(new Date());*/
			 kcgs.setLastModifyTime(new Date());
			 System.out.println("修改KCGS信息"+kcgs);
			this.kcGoodsService.update(kcgs);
			 mav.setViewName("redirect:listPage.do");
			 return mav;
		 }
		
		
	
}
