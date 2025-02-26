package com.kdy.oct251t;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class M {
	public void make(HttpServletRequest req) {
		req.setAttribute("no", 1);
		System.out.println(1);
	}
}
