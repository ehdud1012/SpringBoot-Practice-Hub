package com.kdy.nov04mp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		DateManager.getCurYear(req);
		req.setAttribute("contentPage", "home");
		return "index";
	}
	@GetMapping("/index.do")
	public String index(HttpServletRequest req) {
		req.setAttribute("contentPage", "home");
		return "index";
	}
}
