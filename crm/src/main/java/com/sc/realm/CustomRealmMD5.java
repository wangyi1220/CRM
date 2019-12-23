package com.sc.realm;

import java.util.ArrayList;
import java.util.List;

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

import com.sc.entity.SysUsers;
import com.sc.service.SysUsersService;




public class CustomRealmMD5 extends AuthorizingRealm {
	
	//依赖注入
	@Autowired
	SysUsersService sysUsersService;
	
	//用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		/*SysUser sysUser=(SysUser)arg0.getPrimaryPrincipal();
		System.out.println("授权的用户ID是："+sysUser.getId());
		
		List<String> allperms=new ArrayList<String>();
		List<SysPermission> list = this.sysPermissionService.getpermission(sysUser.getId());
		if(list!=null&&list.size()>0){
			for (SysPermission sp : list) {
				String code = sp.getPercode();
				if(code!=null&&!code.equals("")){
					allperms.add(code);
				}
			}
		}
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		info.addStringPermissions(allperms);
		return info;*/
		return null;
		
	}
	
	//用户认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {

		String 	usersName = (String)arg0.getPrincipal();
		System.out.println("认证的用户名是："+usersName);
		SysUsers user = new SysUsers();
		user.setUsersName(usersName);
		SysUsers users = this.sysUsersService.login(user);
		
		if(users==null){
			System.out.println("用户不存在！");
			return null;
		}
		System.out.println("用户存在！");
		String password=users.getUsersPassword();
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(usersName, password,
				this.getName());
		System.out.println("到底");
		return info;
	}

}
