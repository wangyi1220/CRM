package com.sc.controller;

import java.util.List;

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

	
	
	@RequestMapping("/list.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		PageInfo<JhGysxx> ii = jhGysxxService.selectpage(pageNum, pageSize);
		for (JhGysxx xx :  ii.getList()){
			System.out.println(xx);
		}
		
		mav.addObject("pGsy",ii);
		
		mav.setViewName("fhw/JH-gysListPage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	
	@RequestMapping("/gysSearch.do")
	public ModelAndView gysSearch(ModelAndView mav,HttpServletRequest req,HttpServletResponse resp){
		System.out.println("仿百度查询");
		
		String data = req.getParameter("data");
		System.out.println("------>"+data);
		List<JhGysxx> searchByName = jhGysxxService.searchByName(data);
		
	/*	List<word> list = dao.getByWord(data);
		for (word w : list) {
			System.out.println("---------->"+w);
		}
		req.setAttribute("list", list);
		req.getRequestDispatcher("list.jsp").forward(req, resp);
		mav.addObject("pGsy",info);*/
		

		
		/*mav.setViewName("fhw/JH-gysListPage");// 路径是：/WEB-INF/userslistpage.jsp*/
		return mav;
	}
	
	
}
