package com.sc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sc.interceptor.SysLogInterceptor;

@Configuration
public class MvcInterceptorConfig extends WebMvcConfigurerAdapter  {

	
	   @Autowired
	    private SysLogInterceptor sysLogInterceptor;

	  /*  @Override
	    protected void addInterceptors(InterceptorRegistry registry) {
	        // 多个拦截器组成一个拦截器链
	        // addPathPatterns 用于添加拦截规则，/**表示拦截所有请求
	        // excludePathPatterns 用户排除拦截
	        registry.addInterceptor(sysLogInterceptor).addPathPatterns("/**")
	        .excludePathPatterns("/css/**","/fonts/**"
	        		,"/html/**","/images/**","/js/**",
	        		"/My97DatePicker/**","/plugins/**",
	        		"/upload/**","/error**");  
	        super.addInterceptors(registry);
	    }*/
	    
	    @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	    	registry.addInterceptor(sysLogInterceptor).addPathPatterns("/**")
	        .excludePathPatterns("/css/**","/fonts/**"
	        		,"/html/**","/images/**","/js/**",
	        		"/My97DatePicker/**","/plugins/**",
	        		"/upload/**","/error**","/sql/**");  
	    	super.addInterceptors(registry);
	    }
	    
	   /*@Override
	    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	        super.addResourceHandlers(registry);
	    }*/

	   
	   
}
