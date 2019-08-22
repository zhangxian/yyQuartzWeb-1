package com.yycoin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.china.center.tools.Security;
import com.yycoin.pojo.UserInfo;
import com.yycoin.service.IOaUserService;
import com.yycoin.vo.TCenterOaUser;

@Controller
public class LoginController {

	private static Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private IOaUserService oaUserService;

	@RequestMapping("/dologin")
	public ModelAndView dologin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		log.info("do login");
		ModelAndView view = new ModelAndView();
		HttpSession session = request.getSession();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
			view.setViewName("login");
			out.write("<script> alert('请填写用户名和密码！')</script>");
			out.flush();
			out.close();
			return view;
		}
		List<TCenterOaUser> oaUserList = oaUserService.queryOaUserListByUserName(userName);
		if (oaUserList.size() == 0) {
			view.setViewName("login");
			out.write("<script> alert('用户名或密码错误!')</script>");
			out.flush();
			out.close();
			return view;
		}

		TCenterOaUser oaUSer = oaUserList.get(0);
		if (!oaUSer.getPassword().equals(Security.getSecurity(password))) {
			view.setViewName("login");
			out.write("<script> alert('用户名或密码错误!')</script>");
			out.flush();
			out.close();
			return view;
		}
		UserInfo userInfo = new UserInfo();
		userInfo.setPassword(password);
		userInfo.setUserName(userName);
		session.setAttribute("userInfo", userInfo);

		out.write("<script> window.parent.location.href ='/dashboard'</script>");
		out.flush();
		out.close();
		return null;
	}

	@RequestMapping("/dashboard")
	public ModelAndView dashboard() {
		ModelAndView view = new ModelAndView();
		view.setViewName("dashboard");
		return view;
	}

	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		PrintWriter out = response.getWriter();
		out.write("<script> window.parent.location.href ='/index'</script>");
		out.flush();
		out.close();
	}

	@RequestMapping("/login")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		return view;
	}
}
