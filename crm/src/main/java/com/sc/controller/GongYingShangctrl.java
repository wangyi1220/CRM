package com.sc.controller;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;
import com.sc.service.JhGysxxService;

@Controller
@RequestMapping("/GongYingShangctrl")
public class GongYingShangctrl {
	
	@Autowired
	JhGysxxService  jhGysxxService;

	
	//页面显示
	@RequestMapping("/list.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize,
			String gysName){
		System.out.println("查询gys列表-分页！"+gysName);
		if(gysName==null){//查询全部
			//查询list集合-分页     ${page.list}
			System.out.println("123");
			PageInfo<JhGysxx> ii = jhGysxxService.selectpage(pageNum, pageSize);
			mav.addObject("pgys",ii);
		}else {//模糊查询
			PageInfo<JhGysxx> moHu = jhGysxxService.searchByLikeName(gysName, pageNum, pageSize);
			mav.addObject("pgys",moHu);
		}
		mav.setViewName("fhw/JH-gysListPage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	//删除
	@RequestMapping("/gysDelete.do")
	public ModelAndView gysDelete(ModelAndView mav,
									Long gysId){
		
	
		System.out.println("------------------>供应商删除"+gysId);
		jhGysxxService.delete(gysId);
		
		mav.setViewName("redirect:list.do");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	//删除选中
		@RequestMapping("/gysDeleteSelect.do")
		public ModelAndView gysDeleteSelect(ModelAndView mav,
										HttpServletRequest req,
										HttpServletResponse resp){
			
			String[] idsArr = req.getParameterValues("gysId");
			System.out.println("------------------>供应商删除"+idsArr.length);
			for (String gysIdStr : idsArr) {
				long gysId = Long.parseLong(gysIdStr);
				System.out.println("-------------->"+gysId);
				jhGysxxService.delete(gysId);
			}
			
			mav.setViewName("redirect:list.do");// 路径是：/WEB-INF/userslistpage.jsp
			return mav;
		}
	
	
	
	
	
	//to修改页面
	@RequestMapping("/gysToUpdate.do")
	public ModelAndView gysToUpdate(ModelAndView mav,
									Long gysId){
		
	
		System.out.println("------------------>供应商id"+gysId);
		JhGysxx gys = jhGysxxService.get(gysId);
		
		
		mav.addObject("gysUpdate",gys);
		
		mav.setViewName("fhw/JH-gysUpdate");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	
	//修改页面
	@RequestMapping("/gysUpdate.do")
	public ModelAndView gysUpdate(ModelAndView mav,
									JhGysxx gys){
		
	
		System.out.println("------------------>供应商id"+gys);
		jhGysxxService.update(gys);
		
		
	
		
		mav.setViewName("redirect:list.do");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	
	//to添加供应商
		@RequestMapping("/gysToAdd.do")
		public ModelAndView gysToAdd(ModelAndView mav){
			
		
			System.out.println("------------------>添加");
			
			
			
			//mav.addObject("gysUpdate",gys);
			
			mav.setViewName("fhw/JH-gysAdd");// 路径是：/WEB-INF/userslistpage.jsp
			return mav;
		}
		
		//添加供应商
				@RequestMapping("/gysAdd.do")
				public ModelAndView gysAdd(ModelAndView mav,
											JhGysxx gys){
					/*SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");
					Date date = dateFormat.parse(new Date());
					System.out.println("---------------->"+dateFormat.format(new Date()));
					//gys.setLtime(date);*/
					System.out.println("------------------>添加"+gys);
					jhGysxxService.add(gys);
					
					
					//mav.addObject("gysUpdate",gys);
					
					mav.setViewName("redirect:list.do");// 路径是：/WEB-INF/userslistpage.jsp
					return mav;
		}
	
	//仿百度搜索
	@RequestMapping("/gysSearch.do")
	protected ModelAndView doPost(ModelAndView mav,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("仿百度查询");
		
		String data = req.getParameter("data");
		System.out.println("------>"+data);
		List<JhGysxx> searchList = jhGysxxService.searchByName(data);
		
		for (JhGysxx jhGysxx : searchList) {
			System.out.println("----------------->模糊查询结果"+jhGysxx.getGysName());
		}
		
		
		mav.addObject("searchList", searchList);
		mav.setViewName("fhw/gysSearch");
		/*req.setAttribute("searchList", searchList);
		req.getRequestDispatcher("../fhw/gysSearch.jsp").forward(req, resp);*/
		return mav;
	}
	
	
	
}
