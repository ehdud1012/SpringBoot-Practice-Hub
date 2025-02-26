package com.kdy.n252.jAJAX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.kdy.n252.jAJAX.drink.DrinkDAO;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@Autowired
	private DrinkDAO dDAO;
	@GetMapping("/")
	public String home(HttpServletRequest req) {
		dDAO.get(req);
		return "index";
	}

}
