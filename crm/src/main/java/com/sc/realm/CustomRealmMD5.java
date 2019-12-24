package com.sc.realm;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.SysCompanyinfo;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysUsersService;




public class CustomRealmMD5 extends AuthorizingRealm {
	
	//依赖注入
	@Autowired
	SysUsersService sysUsersService;
	@Autowired
	HttpSession session;
	
	//用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SysUsers user=(SysUsers)arg0.getPrimaryPrincipal();
		System.out.println("授权的用户ID是："+user.getUsersId());
		
		List<String> allperms=new ArrayList<String>();
		SysUsers selectPower = this.sysUsersService.selectPower(user);
		if(selectPower!=null){
			for (SysPowerinfo sp : selectPower.getSysPowerinfoes()) {
				String code = sp.getPowerCode();
				if(code!=null&&!code.equals("")){
					allperms.add(code);
				}
			}
		}
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		info.addStringPermissions(allperms);
		return info;
		
	}
	
	//用户认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {

		String 	usersName = (String)arg0.getPrincipal();
		System.out.println("认证的用户名是："+usersName);
		SysUsers user = new SysUsers();
		user.setUsersName(usersName);
		SysUsers users = this.sysUsersService.login(user);
		SysCompanyinfo cinfo = (SysCompanyinfo)session.getAttribute("cinfo");
		System.out.println("公司主键为："+cinfo.toString());
		if(users==null){
			System.out.println("用户不存在！");
		 	return null;
			  
		}
		if(users.getCompanyId()!=cinfo.getPk()){
	 		System.out.println("用户非此公司员工");
	 		return null;
	 	}
		
		System.out.println("用户存在！");
		String password=users.getUsersPassword();
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(users, password,
				this.getName());
		System.out.println("到底");
		return info;
	}

}
