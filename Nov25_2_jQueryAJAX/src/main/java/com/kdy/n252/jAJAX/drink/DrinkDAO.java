package com.kdy.n252.jAJAX.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class DrinkDAO {
	@Autowired
	private DrinkRepository dr;
	public void get(HttpServletRequest req) {
		req.setAttribute("drinks", dr.findAll());
	}
	
	public Drinks toXML() {
		return new Drinks(dr.findAll());
	}
}
