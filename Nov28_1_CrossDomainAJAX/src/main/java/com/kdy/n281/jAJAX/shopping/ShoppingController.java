package com.kdy.n281.jAJAX.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ShoppingController {
	@Autowired
	private ShoppingDAO sDAO;
	
	@GetMapping(value = "/shopping.search.get", produces = "application/json;charset=utf-8")
	public @ResponseBody String weatherGet(HttpServletRequest req) {
		return sDAO.getResult(req);
	}
}
