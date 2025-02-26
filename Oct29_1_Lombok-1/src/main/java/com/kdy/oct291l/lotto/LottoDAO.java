package com.kdy.oct291l.lotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class LottoDAO {
	
	private Random r;
	
	public LottoDAO() {
		// TODO Auto-generated constructor stub
		r = new Random();
	}
	
	public void numPick(HttpServletRequest req) {
		HashSet<Integer> lottoNum = new HashSet<Integer>();
		while (lottoNum.size() != 6) {
			lottoNum.add(r.nextInt(45) + 1);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>(lottoNum);
		al.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		ArrayList<String> l = new ArrayList<String>();
		for (Integer integer : al) {
			l.add(String.format("img/lotto/ball_%d.png", integer));
		}
		req.setAttribute("lotto", l);
	}
}
