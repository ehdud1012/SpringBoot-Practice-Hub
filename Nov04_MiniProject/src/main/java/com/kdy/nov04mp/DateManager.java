package com.kdy.nov04mp;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;


public class DateManager {
	public static void getCurYear(HttpServletRequest req) {
		String cy  = new SimpleDateFormat("yyyy").format(new Date());
		int curYear = Integer.parseInt(cy);
		req.setAttribute("curYear", curYear);
		System.out.println(curYear);
	}
}
