package com.sc.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.entity.JhGysxx;
import com.sc.service.JhCgdService;
import com.sc.service.JhCgdxqService;

@Controller
@RequestMapping("/caiGouDanCtrl")
public class caiGouDanCtrl {

	//注入sevice
	@Autowired
	JhCgdService  jhCgdService;
	
	
	@Autowired
	JhCgdxqService jhCgdxqService;
	
	
	//采购单页面显示
	@RequestMapping("/cgdList.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		PageInfo<JhCgd> ii = jhCgdService.selectpage(pageNum, pageSize);
		System.out.println("-------------------------------->>>>>>>>>>>>采购单页面");
		
		mav.addObject("pCgd",ii);
		
		mav.setViewName("fhw/JH-cgdListPage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	

	
		//采购单删除
		@RequestMapping("/cgdDelete.do")
		public ModelAndView gysDelete(ModelAndView mav,
										Long cgdId,
										@RequestParam(defaultValue="1")Integer pageNum,
										@RequestParam(defaultValue="5")Integer pageSize){
			
		
			System.out.println("------------------>供应商删除"+cgdId);
			jhCgdService.delete(cgdId);
			//传给
			mav.addObject("cgdId", cgdId);
			mav.setViewName("redirect:cgdAndXqDelete.do");// 路径是：/WEB-INF/userslistpage.jsp
			return mav;
		}
		
		//cgd连同cgdxq删除
		@RequestMapping("/cgdAndXqDelete.do")
		public ModelAndView cgdAndXqDelete(ModelAndView mav,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize,
				Long cgdId){
			System.out.println("cgd连同cgdxq删除"+cgdId);
			
			//查询list集合-分页     ${page.list}
			PageInfo<JhCgdxq> ii = jhCgdxqService.selectpage(cgdId,pageNum, pageSize);
			List<JhCgdxq> list = ii.getList();
			for (JhCgdxq jhCgdxq : list) {
				BigDecimal cgXqId = jhCgdxq.getCgXqId();
				jhCgdxqService.delete(cgXqId);
			}
			mav.setViewName("redirect:cgdList.do");// 路径是：/WEB-INF/userslistpage.jsp
			return mav;
		}
		
		
		
	
		//删除选中
				@RequestMapping("/cgdDeleteSelect.do")
				public ModelAndView cgdDeleteSelect(ModelAndView mav,
													HttpServletRequest req){
					
					String[] idsArr = req.getParameterValues("cgdId");
					System.out.println("------------------>采购单详情选择删除"+idsArr.length);
					for (String cgdIdStr : idsArr) {
						long cgdId = Long.parseLong(cgdIdStr);
						System.out.println("-------------->"+cgdIdStr);
						jhCgdService.delete(cgdId);
					}
					mav.addObject("cgdIdsArr", idsArr);
					mav.setViewName("redirect:cgdAndXqDeleteSelect.do");// 路径是：/WEB-INF/userslistpage.jsp
					return mav;
				}	
				
				
				//cgd连同cgdxq删除
				@RequestMapping("/cgdAndXqDeleteSelect.do")
				public ModelAndView cgdxqList(ModelAndView mav,
						@RequestParam(defaultValue="1")Integer pageNum,
						@RequestParam(defaultValue="5")Integer pageSize,
						Long[] cgdIdsArr){
					System.out.println("cgd连同cgdxq删除"+cgdIdsArr.length);
					for (Long cgdId : cgdIdsArr) {
							System.out.println("-------------->"+cgdId);
							//查询list集合-分页     ${page.list}
							PageInfo<JhCgdxq> ii = jhCgdxqService.selectpage(cgdId,pageNum, pageSize);
							List<JhCgdxq> list = ii.getList();
							for (JhCgdxq jhCgdxq : list) {
								System.out.println("----------删除jinlai");
								BigDecimal cgXqId = jhCgdxq.getCgXqId();
								jhCgdxqService.delete(cgXqId);
								System.out.println("---------------删除成功"+cgXqId);
							}
					}
					
					mav.setViewName("redirect:cgdList.do");// 路径是：/WEB-INF/userslistpage.jsp
					return mav;
				}
				
				
				//付款

				//删除选中
						@RequestMapping("/cgdFuKuan.do")
						public ModelAndView cgdFuKuan(ModelAndView mav,Long cgdId){
							System.out.println("---------------->fk"+cgdId);
							JhCgd cgd = jhCgdService.get(cgdId);
							cgd.setFkqk("已付款");
							jhCgdService.update(cgd);
							mav.setViewName("redirect:cgdList.do");// 路径是：/WEB-INF/userslistpage.jsp
							return mav;
						}	
				
			/*	
				//添加采购单
				@RequestMapping("/cgdToAdd.do")
				public ModelAndView cgdToAdd(ModelAndView mav){
					System.out.println("---------------->采购单ToAdd");
					mav.setViewName("JH-cgdAdd");// 路径是：/WEB-INF/userslistpage.jsp
					return mav;
		}*/
}
