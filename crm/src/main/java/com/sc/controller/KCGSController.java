package com.sc.controller;

import java.util.Date;

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
	//分页查询--商品名字
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
	
	//添加
		 @RequestMapping("/add.do")
		 public ModelAndView addofficeKpi(ModelAndView mav,KcGoods kcgs){
			 kcgs.setLastModifyTime(new Date());
			 System.out.println("添加库存商品信息"+kcgs);
			this.kcGoodsService.add(kcgs);
			 mav.setViewName("yjs/addKCGSPage");
			 return mav;
			 }
		 //删除
		@RequestMapping("/delete.do")
		public ModelAndView delete(ModelAndView mav, KcGoods kcgs){
			System.out.println("删除库存商品信息！"+kcgs);
			this.kcGoodsService.delete(kcgs.getGoodsId());
			mav.setViewName("redirect:listpage.do");//重定向到list方法
			return mav;
		}
		//修改
		 @RequestMapping("/goupdate.do")
		 public ModelAndView goupdate(ModelAndView mav,long gid ){
				System.out.println("进入了goupdate");
				mav.addObject("kcgs", kcGoodsService.getGsID(gid));//？=我从页面获取的参数在这里起什么作用
				mav.setViewName("yjs/updateKCGSPage");
				return mav;
			}
		 @RequestMapping("update.do")
		 public ModelAndView OfficeKpiupdate(ModelAndView mav,KcGoods kcgs){
			 kcgs.setLastModifyTime(new Date());
			 System.out.println("修改库存商品信息"+kcgs);
			this.kcGoodsService.update(kcgs);
			 mav.setViewName("redirect:listpage.do");
			 return mav;
		 }
		
	
}
