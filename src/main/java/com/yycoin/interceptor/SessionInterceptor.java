package com.yycoin.interceptor;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.yycoin.pojo.UserInfo;

//session拦截器
@Component("sessionInterceptor")
public class SessionInterceptor implements HandlerInterceptor {

	// 忽略的URL地址
	private static final String[] IGNORE_URI = { "/login", "/logout", "/error", "/dologin", "/est", "/queryLog",
			"/list", "/thg" };

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		contextPath = contextPath + "/";

		List<String> ignoreList = Arrays.asList(IGNORE_URI);

		boolean ret = false;
		for (String url : ignoreList) {
			if (requestURI.startsWith(url)) {
				ret = true;
				break;
			}
		}
		if (!ret && userInfo == null) {
			PrintWriter out = response.getWriter();
			out.write("<script> top.location.href ='/login'</script>");
			out.flush();
			out.close();
			return false;
		}
		return ret;
	}
}
