package com.kdy.oct291l.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LottoController {
	
	@Autowired
	private LottoDAO lDAO;
	
	@GetMapping("/lotto.go")
	public String lottoGo(HttpServletRequest req) {
		lDAO.numPick(req);
		req.setAttribute("contentPage", "lotto");
		return "index";
	}
	@GetMapping("/lotto.re_do")
	public String lottoReDo(HttpServletRequest req) {
		lDAO.numPick(req);
		req.setAttribute("contentPage", "lotto");
		return "index";
	}
}
