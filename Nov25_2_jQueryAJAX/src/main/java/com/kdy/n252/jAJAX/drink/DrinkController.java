package com.kdy.n252.jAJAX.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DrinkController {
	@Autowired
	private DrinkDAO dDAO;
	
	@GetMapping(value = "/drink.get", produces = "application/xml;charset=utf-8")
	public @ResponseBody Drinks drinkGet() {
		return dDAO.toXML();
	}
}
 