package com.kdy.n252.jAJAX.snack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SnackDAO {
	@Autowired
	private SnackRepository sr;
	
	public Snacks snackGetToJson(Snack s) {
		return new Snacks(sr.findByPriceGreaterThanEqual(s.getPrice()));
	}
}
