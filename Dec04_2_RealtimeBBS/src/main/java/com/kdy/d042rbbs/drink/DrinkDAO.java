package com.kdy.d042rbbs.drink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkDAO {
	@Autowired
	private DrinkRepository dr;
	
	public Drinks drinkGetToJson(Drink d) {
		return new Drinks(dr.findAll());
	}
	public String drinkReg(Drink d) {
		try {
			dr.save(d);
			String json = String.format("{\"result\":\"%s 등록성공\"}", d.getName());
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return "{\"result\":\"%s 등록실패\"}";
		}
	}
}
