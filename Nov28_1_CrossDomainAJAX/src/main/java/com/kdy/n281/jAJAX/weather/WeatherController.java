package com.kdy.n281.jAJAX.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WeatherController {
	@Autowired
	private WeatherDAO wDAO;
	
	// C-V 연결 green
	@GetMapping(value = "/weather.get", produces = "application/xml;charset=utf-8")
	public @ResponseBody String weatherGet(HttpServletRequest req) {
		return wDAO.getWeather(req); // C-M 연결 pink
	}
}
