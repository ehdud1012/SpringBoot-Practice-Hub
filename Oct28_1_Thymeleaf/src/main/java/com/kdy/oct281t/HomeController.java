package com.kdy.oct281t;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		return "input";
	}
	@GetMapping("/index.do")
	public String index(HttpServletRequest req){
		return "input";
	}
}
