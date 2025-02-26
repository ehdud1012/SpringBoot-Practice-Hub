package com.kdy.oct311jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kdy.oct311jpa.snack.Snack;
import com.kdy.oct311jpa.snack.SnackDAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@Autowired
	private SnackDAO sDAO;	
	
	@GetMapping("/")
	public String home(Snack s, HttpServletRequest req) {
		sDAO.get(s, req);
		return "index";
	}
}
