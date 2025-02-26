package com.kdy.oct291l.lombok;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class Calculator {
	public void calculate(Product p, HttpServletRequest req) {
		
		req.setAttribute("name", p.getName());
		req.setAttribute("result", p.getPrice() * p.getNum());
	}
}
