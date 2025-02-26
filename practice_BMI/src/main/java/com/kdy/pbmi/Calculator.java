package com.kdy.pbmi;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class Calculator {
	public void calculate(Member b, HttpServletRequest req) {
		double h = (double) b.getHeight() / 100;
		double bmiD = (double) b.getWeight() / (h * h);
		String bmi = String.format("%.2f", bmiD);
		b.setBmi(bmi);
		
		String result = "저체중";
		if(bmiD >= 39) { result = "고도비만";}
		else if(bmiD >= 32) { result = "중도비만";}
		else if(bmiD >= 30) { result = "경도비만";}
		else if(bmiD >= 24) { result = "과체중";}
		else if(bmiD >= 10) { result = "정상";}
		b.setResult(result);
		
		req.setAttribute("result", b);
	}
}
