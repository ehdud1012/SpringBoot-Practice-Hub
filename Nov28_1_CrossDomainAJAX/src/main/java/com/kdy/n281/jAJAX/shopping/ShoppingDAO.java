package com.kdy.n281.jAJAX.shopping;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class ShoppingDAO {
	public String getResult(HttpServletRequest req) {
		HttpsURLConnection huc = null;
		try {
			String query = req.getParameter("query");
			String search = URLEncoder.encode(query, "utf-8");
			URL u = URI.create("https://openapi.naver.com/v1/search/shop.json?query=" + search).toURL();
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id", "J3ex8lwJZO0JU8nonIoa");
			huc.addRequestProperty("X-Naver-Client-Secret", "oXpEo7AifR");
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
