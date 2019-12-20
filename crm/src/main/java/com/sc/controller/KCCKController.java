package com.sc.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.KcCangku;
import com.sc.entity.OfficeKpi;
import com.sc.service.KcCangkuService;

@Controller
@RequestMapping("/KCCKControllerCtrl")//KCCK--�ֿ���
public class KCCKController {
	
	@Autowired
	KcCangkuService kcCangkuService;
	//��ҳ��ѯ
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,KcCangku kcck){
		
		mav.addObject("p", kcCangkuService.select(pageNum, pageSize,kcck));
		//��תҳ��
		mav.setViewName("yjs/selectKCCKPage");
		
		System.out.println("��ҳ");
		
		return mav;
	}
	//���
	 @RequestMapping("/add.do")//ȥ���
	 public ModelAndView addofficeKpi(ModelAndView mav){
		
		 mav.setViewName("yjs/addKCCKPage");
		 return mav;
		 }
	 
	 @RequestMapping("/addKCCK.do")//ִ�����
	 public ModelAndView addofficeKpi(ModelAndView mav,KcCangku kcck){
		kcck.setCangkuLastModifyTime(new Date());
		 System.out.println("��ӿ��ֿ�"+kcck);
		this.kcCangkuService.add(kcck);
		 mav.setViewName("redirect:listPage.do");
		 return mav;
		 }
	 //ɾ��
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav, Long kcck){
		System.out.println("ɾ���ֿ⣡"+kcck);
		kcCangkuService.delete(kcck);
		mav.setViewName("redirect:listPage.do");//�ض���list����
		return mav;
	}
	//�޸�
	 @RequestMapping("/goupdate.do")
	 public ModelAndView goupdate(ModelAndView mav,Long cangkuId ){
			System.out.println("������goupdate");
			mav.addObject("kcck", kcCangkuService.getCkID(cangkuId));
			mav.setViewName("yjs/updateKCCKPage");
			return mav;
		}
	 @RequestMapping("/update.do")
	 public ModelAndView OfficeKpiupdate(ModelAndView mav,KcCangku kcck){
		 kcck.setCangkuLastModifyTime(new Date());
		 System.out.println("�޸Ĳֿ���Ϣ"+kcck);
		this.kcCangkuService.update(kcck);
		 mav.setViewName("redirect:listPage.do");
		 return mav;
	 }
	
}
