package com.kdy.n281.jAJAX.weather;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class WeatherDAO {
	public String getWeather(HttpServletRequest req) {
		HttpsURLConnection huc = null;
		try {
			// M에서 기상청에게 요청 -> 응답 받기 blue
			String zone = req.getParameter("zone");
			URL u = URI.create("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=" + zone).toURL();
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			huc.disconnect();
		}
	}
}
