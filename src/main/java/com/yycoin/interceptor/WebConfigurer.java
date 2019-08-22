package com.yycoin.interceptor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

	@Autowired
	SessionInterceptor sessionInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns("/**") 表示拦截所有的请求，
		List<String> exclude = new ArrayList<String>();
		exclude.add("/");
		exclude.add("/login");
		exclude.add("/logout");
		exclude.add("/resources/**");
		registry.addInterceptor(sessionInterceptor).addPathPatterns("/**").excludePathPatterns(exclude);
	}
}
