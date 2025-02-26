package com.kdy.nov041e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

// 암호화
// SpringSecurity : 자체적 로그인 시스템

@Controller
public class HomeController {
	
	@Autowired
	private MemberDAO mDAO;
	
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		return "index";
	}
	@GetMapping("/login.do")
	public String login(Member m, HttpServletRequest req) {
		mDAO.login(m, req);
		return "index";
	}
}
