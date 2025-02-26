package com.kdy.oct291l.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LombokController {
	
	@Autowired
	private Calculator c;
	
	@GetMapping("/lombok.go")
	public String lombokGo(HttpServletRequest req) {
		req.setAttribute("contentPage", "productInput");
		return "index";
	}
	@GetMapping("/calculate.go")
	public String calculateGo(Product p, HttpServletRequest req) {
		c.calculate(p, req);
		req.setAttribute("contentPage", "productOutput");
		return "index";
	}
}
