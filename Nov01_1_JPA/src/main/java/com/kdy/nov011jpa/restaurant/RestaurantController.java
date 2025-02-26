package com.kdy.nov011jpa.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kdy.nov011jpa.menu.Menu;
import com.kdy.nov011jpa.menu.MenuDAO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RestaurantController {
	
	@Autowired
	private RestaurantDAO rDAO;
	@Autowired
	private MenuDAO mDAO;
	
	@GetMapping("/reg.restaurant")
	public String regRestaurant(Menu m, Restaurant r, HttpServletRequest req) {
		rDAO.reg(r, req);
		rDAO.get(r, req);
		mDAO.get(m, req);
		return "restaurant/input";
	}
	@GetMapping("/restaurant.del")
	public String delRestaurant(Menu m, Restaurant r, HttpServletRequest req) {
		rDAO.del(r, req);
		rDAO.get(r, req);
		mDAO.get(m, req);
		return "restaurant/input";
	}
	@GetMapping("/restaurant.update")
	public String updateRestaurant(Menu m, Restaurant r, HttpServletRequest req) {
		rDAO.update(r, req);
		rDAO.get(r, req);
		mDAO.get(m, req);
		return "restaurant/input";
	}
	
	@GetMapping("/reg.menu")
	public String regMenu(Menu m, Restaurant r, HttpServletRequest req) {
		mDAO.reg(m, req);
		rDAO.get(r, req);
		mDAO.get(m, req);
		return "restaurant/input";
	}
}
