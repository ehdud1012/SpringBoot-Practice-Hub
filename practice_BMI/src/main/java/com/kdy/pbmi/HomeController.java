package com.kdy.pbmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@Autowired
	private Calculator c;
	
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		return "input";
	}
	@GetMapping("/index.do")
	public String indexDo(HttpServletRequest req) {
		return "input";
	}
	@GetMapping("/calculate.go")
	public String calculate(Member b, HttpServletRequest req) {
		c.calculate(b, req);
		return "output";
	}
}
