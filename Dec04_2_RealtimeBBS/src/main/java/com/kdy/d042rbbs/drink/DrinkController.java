package com.kdy.d042rbbs.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DrinkController {
	@Autowired
	private DrinkDAO dDAO;
	
	@GetMapping(value = "/drink.get", produces = "application/json;charset=utf-8")
	public @ResponseBody Drinks drinkGet(Drink d, HttpServletResponse res) {
		res.setHeader("Access-Control-Allow-Origin", "*");
		return dDAO.drinkGetToJson(d);
	}
	
	@GetMapping(value = "/drink.reg", produces = "application/json;charset=utf-8")
	public @ResponseBody String drinkReg(Drink d) {
		return dDAO.drinkReg(d);
	}
}
