package com.kdy.oct301f;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

// JPA (Java Persistance API) : 방법론
//		방법론대로 실제 구현해놓은 라이브러리 : hibernate
//		MyBatis의 기능(ORM)들에서 유지보수만 빠지고 존재
//			+ SQL 자동 생성
//		SQL - 구조가 정해져있음 = 다 똑같음
//	 		- SQL도 자동 생성

@Controller
public class HomController {
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		req.setAttribute("contentPage", "home");
		return "index";
	}
	@GetMapping("/index.do")
	public String indexDo(HttpServletRequest req) {
		req.setAttribute("contentPage", "home");
		return "index";
	}
}
