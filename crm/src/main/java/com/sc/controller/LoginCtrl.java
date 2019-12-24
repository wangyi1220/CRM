package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Message;
import com.sc.entity.SysCompanyinfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysCompanyInfoService;

@Controller
@RequestMapping("/LoginCtrl")
public class LoginCtrl {
	
	@Autowired
	SysCompanyInfoService sysCompanyInfoService;
	
	
	@RequestMapping("/login.do") 
	//完整的地址是：http://localhost:8080/springMVC1/loginctrl/login.do
	public ModelAndView login(ModelAndView mav,HttpServletRequest req){//把请求的参数值自动封装到对象的属性
		
		System.out.println("用户认证失败");
		
		String msg = (String)req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);		

		System.out.println("认证失败信息"+msg);
		String fail="";
		if(msg!=null){
			if(msg.equals(UnknownAccountException.class.getName())){
				fail="unknown";//用户名不存在
			}else if(msg.equals(IncorrectCredentialsException.class.getName())){
				fail="error";//密码错误
			}else if(msg.equals("randomCodeError")){
				fail="code";//验证码错误
			}else{
				fail="other";//其他错误
			}
		}
		
		mav.setViewName("redirect:../login.jsp?isfail="+fail);//设置视图名称,重定向到login.jsp

		return mav;
	}
	
	@RequestMapping("/main.do") 
	//完整的地址是：http://localhost:8080/springMVC1/loginctrl/login.do
	public ModelAndView main(ModelAndView mav,HttpSession session){
		System.out.println("用户认证成功");
		//获取主体
		Subject sub = SecurityUtils.getSubject();
		SysUsers user=(SysUsers) sub.getPrincipal();
		System.out.println("主题是"+user.toString());
		session.setAttribute("nowuser", user);
		mav.setViewName("redirect:../main.jsp");
		
		return mav;
		
		
	}
	
	@RequestMapping("/checkcId.do")
	@ResponseBody
	public Message checkcId(SysCompanyinfo sci,HttpServletRequest req){
		
		System.out.println("验证公司代码");
		HttpSession session = req.getSession();
		Message msg=null;
		SysCompanyinfo companyinfo = this.sysCompanyInfoService.get(sci.getPk());
		if(companyinfo!=null){
			session.setAttribute("cinfo", companyinfo);
			msg=new Message("200", "no", "公司代码存在");
		}else{
			msg=new Message("100", "yes", "公司代码不存在");
		}
		return msg;
	}
}
