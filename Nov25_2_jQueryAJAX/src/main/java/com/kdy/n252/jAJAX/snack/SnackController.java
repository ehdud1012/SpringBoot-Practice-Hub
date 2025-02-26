package com.kdy.n252.jAJAX.snack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class SnackController {
	@Autowired
	private SnackDAO sDAO;
	
	@GetMapping(value = "/snack.get", produces = "application/json;charset=utf-8")
	public @ResponseBody Snacks snackGet(Snack s, HttpServletResponse res) {
		res.setHeader("Access-Control-Allow-Origin", "*");
		return sDAO.snackGetToJson(s);
	}
}
