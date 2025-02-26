package com.kdy.nov011jpa.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class MenuDAO {
	@Autowired
	private MenuRepository mr;
	
	public void reg(Menu m, HttpServletRequest req) {
		mr.save(m);
	}
	
	public void get(Menu m, HttpServletRequest req) {
		Sort sort = Sort.by(Sort.Order.asc("no"));
		Pageable p = PageRequest.of(0, 10, sort);
		req.setAttribute("m", mr.findAll(p));
	}
}
