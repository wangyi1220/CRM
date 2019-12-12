package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OfficeKpi;

import com.sc.service.OfficeKpiService;

@Controller
@RequestMapping("/OfficeKpictrl")
public class OfficeKpiController {
	 @Autowired 
	 OfficeKpiService OfficeKpiService ;
	 @RequestMapping("/list.do")
		public ModelAndView list(ModelAndView mav){
			System.out.println("��ѯ�û��б�");
			
			//��ѯlist����
			List<OfficeKpi> list = this.OfficeKpiService.select();
			mav.addObject("list", list);
			mav.setViewName("OA/OfficeKpilistpage");// ·���ǣ�/WEB-INF/userslist.jsp
			return mav;
		}
	 //@RequestMapping("/delete.do")
	 
	
	 @RequestMapping("/listpage.do")
	   public ModelAndView listpage(ModelAndView mav,@RequestParam(defaultValue="1") Integer pageNum,
			@RequestParam(defaultValue="5") Integer pageSize){
		System.out.println("----");
		
		mav.addObject("p",OfficeKpiService.selectpage(pageNum,pageSize));
		//��ѯlist�����÷�ҳ��ʽ
		mav.setViewName("OA/OfficeKpilistpage");// ·���ǣ�/WEB-INF/userslist.jsp
		return mav;
		}
	 
	 @RequestMapping("/upload.do")
		public ModelAndView upload(ModelAndView mav,
				MultipartFile upload,
				HttpServletRequest req) throws IllegalStateException, IOException{
			System.out.println("开始上传文件");
			
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
					
					//设置图片名称,页面显示图片
					mav.addObject("pic", filename);
				}
			}
			
			mav.setViewName("show");// 路径是：/WEB-INF/show.jsp
			return mav;
		}
	 //@RequestMapping("/delete.do")
	 
	 
}
