package com.kdy.nov011jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kdy.nov011jpa.menu.Menu;
import com.kdy.nov011jpa.menu.MenuDAO;
import com.kdy.nov011jpa.restaurant.Restaurant;
import com.kdy.nov011jpa.restaurant.RestaurantDAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@Autowired
	private RestaurantDAO rDAO;
	@Autowired
	private MenuDAO mDAO;
	
	@GetMapping("/")
	public String home(Menu m, Restaurant r, HttpServletRequest req) {
		rDAO.get(r, req);
		mDAO.get(m, req);
		return "restaurant/input";
	}
}
