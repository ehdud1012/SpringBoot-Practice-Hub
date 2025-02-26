package com.kdy.oct281t.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CalcController {
	@Autowired
	private Calculator c;
	
	@GetMapping("/calculate.xy")
	public String calculate(CalcBean cb, HttpServletRequest req) {
		c.calculate(cb, req);
		req.setAttribute("contentPage", "test"); // 확장자 이름 X
		req.setAttribute("cpFrag", "bbb");
		return "output";
	}
}
