package com.kdy.oct311jpa.snack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class SnackDAO {
	
	@Autowired
	private SnackRepository sr;
	
	public void reg(Snack s, HttpServletRequest req) {
		sr.save(s); // insert
	}
	
	public void get(Snack s, HttpServletRequest req) {
		// sr.findAll() // select
		// where https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html 보고 새로 만들기
//		req.setAttribute("snacks", sr.findAll());
//		req.setAttribute("snacks", sr.findByNameContaining("깡"));
//		req.setAttribute("snacks", sr.findByNameStartingWith("깡"));

		// 정렬  order by
		Sort sort = Sort.by(Sort.Order.asc("name"), Sort.Order.desc("price"));
		// 페이지 rownum 	(페이지 번호(0부터), 한페이지당 갯수, 정렬방식)
		Pageable p = PageRequest.of(0, 5, sort);
		req.setAttribute("snacks", sr.findByPriceLessThanEqual(10000, p));
	}
	
	public void del(Snack s, HttpServletRequest req) {
		sr.deleteById(s.getName());
	}
	
	public void update(Snack s, HttpServletRequest req) {
		// PK 기준으로 DB값 불러오기
		Snack dbs = sr.findById(s.getName()).get();
		// s에 값 채워서 save or dbs에 값 채워서 save (작업량 적은 걸로 선택)
		// 키 값이 있으면 update / 있으면 insert
		sr.save(s);
	}
}
