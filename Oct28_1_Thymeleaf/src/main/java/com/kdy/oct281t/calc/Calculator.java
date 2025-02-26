package com.kdy.oct281t.calc;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.kdy.oct281t.dog.Dog;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class Calculator {
	
	public void calculate(CalcBean cb, HttpServletRequest req) {
		int x = cb.getX();
		int y = cb.getY();
		cb.setResult1(x+y);
		cb.setResult2(x-y);
		cb.setResult3(x*y);
		cb.setResult4(x/y);
		req.setAttribute("result", cb);
		
		int q = 20;
		req.setAttribute("q", q);
		req.setAttribute("w", "30");
		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("딸기", 3));
		dogs.add(new Dog("초코", 1));
		dogs.add(new Dog("바닐라", 4));
		req.setAttribute("dogs", dogs);
		
		HashMap<String, Dog> dogs2 = new HashMap<>();
		dogs2.put("나", new Dog("메론", 2));
		dogs2.put("오빠", new Dog("수박", 3));
		req.setAttribute("dogs2", dogs2);
		
		req.getSession().setAttribute("t", 999);
		
		int r =  1234567867;
		req.setAttribute("r", r);

		double rr =  123.63337;
		req.setAttribute("rr", rr);

		req.setAttribute("date", new Date());
		
		req.setAttribute("img", "pooh_family.png");
		req.setAttribute("root", "https://www.naver.com");
		req.setAttribute("z", 1);
		req.setAttribute("x", 2);
	}
}
