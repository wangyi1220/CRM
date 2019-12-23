package com.sc.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysUsersRoleService;
import com.sc.service.SysUsersService;

@Controller
@RequestMapping("/SysUsersCtrl")
public class SysUsersCtrl {
	
	@Autowired
	SysUsersService sysUsersService;
	@Autowired
	SysUsersRoleService sysUsersRoleService;
	
//	@RequestMapping("/goupdate.do")
//	public ModelAndView goupdate(ModelAndView mav,SysUsers user){
//		System.out.println("跳转到修改页面！"+user);
//		
//		SysUsers users = this.sysUsersService.get(user.getUsersId());
//		mav.addObject("user", user);
//		mav.setViewName("usersupdate");
//		return mav;
//	}
	@RequestMapping("/listPage.do")
	public ModelAndView listPage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="7")Integer pageSize){
		
		mav.addObject("p", sysUsersService.select(pageNum, pageSize));
		mav.setViewName("ssf/userslistpage");
		System.out.println(sysUsersService.select(pageNum, pageSize));
		System.out.println("分页");
		
		return mav;
	}
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav,
			HttpServletRequest req,
			SysUsers u) throws IllegalStateException, IOException{
	
		this.sysUsersService.update(u);
		mav.setViewName("redirect:list.do");//重定向到list方法
		return mav;
	}

	@RequestMapping("/userList.do")
	public ModelAndView userList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="7")Integer pageSize,SysUsers users,String isdel){
		
		System.out.println(users.getUsersId());
		System.out.println(users.getUsersName());
		PageInfo<SysUsers> info = this.sysUsersService.selectUserinfo2(pageNum, pageSize, users);
		if(isdel!=null){
			mav.addObject("isdel", "yes");
		}
		mav.addObject("u", info);
		mav.setViewName("wangyi/userlist");
		return mav;
	}
	
	@RequestMapping("/deleteUser.do")
	public ModelAndView deleteUser(ModelAndView mav,SysUsers user,Long[] delid){
		System.out.println("要删除的用户id为"+user.getUsersId());
		this.sysUsersService.deleteUser(user);
		this.sysUsersRoleService.deleteByuId(user.getUsersId());
		if(delid!=null&&delid.length>0){
			for (Long long1 : delid) {
				user.setUsersId(long1);
				System.out.println(long1);
				System.out.println("要删除的用户id为"+user.getUsersId());
				this.sysUsersService.deleteUser(user);
				this.sysUsersRoleService.deleteByuId(user.getUsersId());
			}
		}
		mav.setViewName("redirect:userList.do?isdel=yes");
		return mav;
	}
	
	@RequestMapping("/printExcel.do")
	public void printExcel(Long[] print,HttpServletResponse resp) throws IOException{
		
		//表头数据
		String[] header={"用户id","用户账号","用户姓名","用户状态","最后操作时间"};
		
		//申明一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		//生成一个表格
		HSSFSheet sheet = workbook.createSheet("用户信息表");
		
		//设置表格列宽
		sheet.setDefaultColumnWidth(10);
		
		//创建第一行表头
		HSSFRow headRow = sheet.createRow(0);
		
		//遍历第一行表头
		for (int i = 0; i < header.length; i++) {
			//创建一个单元格
			HSSFCell cell = headRow.createCell(i);
			//创建一个内容对象
			HSSFRichTextString textString = new HSSFRichTextString(header[i]);
			//将内容对象放入单元格
			cell.setCellValue(textString);
		}
		//遍历每一个用户信息
		SimpleDateFormat sdf = new SimpleDateFormat();
		for (int i = 0; i < print.length; i++) {
			HSSFRow row = sheet.createRow(i+1);
			SysUsers sysUsers = this.sysUsersService.selectUserinfo(print[i]);
			for(int j=0;j<5;j++){
				HSSFCell cell = row.createCell(j);
				if(j==0){
					cell.setCellValue(sysUsers.getUsersId());
				}else if(j==1){
					cell.setCellValue(sysUsers.getUsersName());
				}else if(j==2){
					cell.setCellValue(sysUsers.getSysUserinfo().getEmpName());
				}else if(j==3){
					if(sysUsers.getUsersState().equals("0")){
						cell.setCellValue("可用");
					}else{
						cell.setCellValue("禁用");
					}
				}else{
					String format = sdf.format(sysUsers.getChangeDate());
					cell.setCellValue(format);
				}
			}
		}
		
		//准备将Excel的输出流通过response输出到页面下载
        //八进制输出流
		resp.setContentType("application/octet-stream");
		  //这后面可以设置导出Excel的名称，此例中名为student.xls
		resp.setHeader("Content-disposition", "attachment;filename=users.xls");
		//刷新缓冲
        resp.flushBuffer();
        //workbook将Excel写入到response的输出流中，供页面下载
        workbook.write(resp.getOutputStream());
	}
}
