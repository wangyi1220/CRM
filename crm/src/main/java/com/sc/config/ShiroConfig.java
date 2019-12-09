package com.sc.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.realm.CustomFormAuthenticationFilter;
import com.sc.realm.CustomRealmMD5;


@Configuration	//shiro配置类
public class ShiroConfig {
	
	@Autowired
	/*SysPermissionService sysPermissionService;*/
	
	@Bean
	public CustomRealmMD5 customRealmMD5(){
		CustomRealmMD5 realm=new CustomRealmMD5();
		HashedCredentialsMatcher matcher=new HashedCredentialsMatcher();
		matcher.setHashAlgorithmName("md5");
		matcher.setHashIterations(3);
		realm.setCredentialsMatcher(matcher);
		return realm;
		
	}
	
	@Bean
	public SecurityManager securityManager(){
		
		DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
		manager.setRealm(this.customRealmMD5());
		return manager;
	}
	
	@Bean("shiroFilter")
	public  ShiroFilterFactoryBean ShiroFilterFactoryBean(){
		CustomFormAuthenticationFilter form=new CustomFormAuthenticationFilter();
		form.setLoginUrl("/loginctrl/login.do");
		form.setUsernameParam("uname");
		form.setPasswordParam("upass");
		
		ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(this.securityManager());
		shiroFilter.setLoginUrl("/login.jsp");
		shiroFilter.setSuccessUrl("/loginctrl/main.do");
		shiroFilter.setUnauthorizedUrl("/nopermission.jsp");
		
		Map<String, Filter> filters=new HashMap<String, Filter>();
		filters.put("authc", form);
		
		LogoutFilter logout=new LogoutFilter();
		logout.setRedirectUrl("/login.jsp");
		filters.put("logout", logout);
		shiroFilter.setFilters(filters);
		
		LinkedHashMap<String, String> filterMap=new LinkedHashMap<String, String>();
		filterMap.put("/logout.do", "logout");
		filterMap.put("/images/**", "anon");
		filterMap.put("/css/**", "anon");
		filterMap.put("/js/**", "anon");
		filterMap.put("/upload/**", "anon");
		filterMap.put("/login.jsp", "anon");
		filterMap.put("/main.jsp", "anon");
		filterMap.put("/validatecode.jsp", "anon");
		
		filterMap.put("/zhuce.jsp", "anon");
		filterMap.put("/loginctrl/checkuname.do", "anon");
		
		filterMap.put("/datagrid.jsp", "anon");
		filterMap.put("/usersctrl/listjson.do", "anon");
		
		//设置权限
		/*List<SysPermission> list = this.sysPermissionService.getallpermission();*/
		/*if(list!=null&&list.size()>0){
			for (SysPermission sp : list) {
				String url = sp.getUrl();
				String code = sp.getPercode();
				if(url!=null&&!url.equals("")&&code!=null&&!code.equals("")){
					filterMap.put(url, "perms["+code+"]");
				}
			}
		}*/
		
		filterMap.put("/**", "authc");
		shiroFilter.setFilterChainDefinitionMap(filterMap);
		
		return shiroFilter;
		
	}
	
}
