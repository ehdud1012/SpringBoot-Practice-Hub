package com.kdy.nov011jpa.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class RestaurantDAO {
	
	@Autowired
	private RestaurantRepository rr;
	
	public void reg(Restaurant r, HttpServletRequest req) {
		rr.save(r);
	}
	public void get(Restaurant r, HttpServletRequest req) {
		Sort sort = Sort.by(Sort.Order.asc("name"));
		Pageable p = PageRequest.of(0, 10, sort);
//		List<Restaurant> r1 = rr.findAll(p);
//		ArrayList<String> resName = new ArrayList<>();
//		for (Restaurant restaurant : r1) {
//			resName.add(restaurant.getName());
//		}
//		req.setAttribute("resName", resName);
		req.setAttribute("r", rr.findAll(p));
	}
	
	public void del(Restaurant r, HttpServletRequest req) {
		rr.deleteById(r.getName());
	}
	public void update(Restaurant r, HttpServletRequest req) {
		rr.save(r);
	}
}
