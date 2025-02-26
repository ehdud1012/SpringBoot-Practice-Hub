package com.kdy.oct311jpa.snack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SnackController {
	@Autowired
	private SnackDAO sDAO;	
	
	@GetMapping("/snack.reg")
	public String regSnack(Snack s, HttpServletRequest req) {
		sDAO.reg(s, req);
		sDAO.get(s, req);
		return "index";
	}
	
	@GetMapping("/snack.del")
	public String delSnack(Snack s, HttpServletRequest req) {
		sDAO.del(s, req);
		sDAO.get(s, req);
		return "index";
	}
	@GetMapping("/snack.update")
	public String updateSnack(Snack s, HttpServletRequest req) {
		sDAO.update(s, req);
		sDAO.get(s, req);
		return "index";
	}
}
