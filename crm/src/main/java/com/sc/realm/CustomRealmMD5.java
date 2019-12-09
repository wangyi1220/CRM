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




public class CustomRealmMD5 extends AuthorizingRealm {
	
	//依赖注入
	/*@Autowired
	SysUserService sysUserService;
	@Autowired
	SysPermissionService sysPermissionService;*/
	
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

		/*String 	username = (String)arg0.getPrincipal();
		System.out.println("认证的用户名是："+username);
		
		SysUser sysUser = sysUserService.login(username);
		
		if(sysUser==null){
			System.out.println("用户不存在！");
			return null;
		}
		String password=sysUser.getPassword();
		String salt=sysUser.getSalt();
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(sysUser, password,
				ByteSource.Util.bytes(salt),
				this.getName());
		System.out.println("到底");
		return info;*/
		return null;
	}

}
