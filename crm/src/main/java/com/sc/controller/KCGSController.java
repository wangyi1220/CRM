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
@RequestMapping("/KCGSControllerCtrl")//���·��
public class KCGSController {//KCGS--�����Ʒ
	
	@Autowired
	KcGoodsService kcGoodsService;
	//��ҳ��ѯ--��Ʒ����
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize,KcGoods kcgs){
		
		mav.addObject("p", kcGoodsService.select(pageNum, pageSize,kcgs));
		//��ת�������Ʒ��Ϣ��ҳ��
		mav.setViewName("yjs/selectKCGSPage");
		
		System.out.println("��ҳ--KCGS");
		
		return mav;
	}
	
	    //ȥ���
		 @RequestMapping("/add.do")//ȥҳ��תһȦ
		 public ModelAndView addofficeKpi(ModelAndView mav){
			 mav.setViewName("yjs/addKCGSPage");
			 return mav;
		 }
		 
		 @RequestMapping("/addKCGS.do")//������ӵ�
		 public ModelAndView addKCGS(ModelAndView mav,KcGoods kcgs){
			 kcgs.setLastModifyTime(new Date());
			 System.out.println("��ӿ����Ʒ��Ϣ"+kcgs);
			this.kcGoodsService.add(kcgs);
			 mav.setViewName("redirect:listPage.do");
			 return mav;
			 }
		 
		 //ɾ��
		@RequestMapping("/delete.do")
		public ModelAndView delete(ModelAndView mav, Long kcgs){
			System.out.println("ɾ�������Ʒ��Ϣ��"+kcgs);
			this.kcGoodsService.delete(kcgs);
			mav.setViewName("redirect:listPage.do");//�ض���list����
			return mav;
		}
		//�޸�
		 @RequestMapping("/goupdate.do")
		 public ModelAndView goupdate(ModelAndView mav,Long gid ){
				System.out.println("������goupdate");
				mav.addObject("kcgs", kcGoodsService.getGsID(gid));
				mav.setViewName("yjs/updateKCGSPage");
				return mav;
			}
		 @RequestMapping("/update.do")
		 public ModelAndView OfficeKpiupdate(ModelAndView mav,KcGoods kcgs){
			/* kcck.setCangkuLastModifyTime(new Date());*/
			 kcgs.setLastModifyTime(new Date());
			 System.out.println("�޸�KCGS��Ϣ"+kcgs);
			this.kcGoodsService.update(kcgs);
			 mav.setViewName("redirect:listPage.do");
			 return mav;
		 }
		
		
	
}
