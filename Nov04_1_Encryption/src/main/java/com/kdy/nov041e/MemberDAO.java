package com.kdy.nov041e;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;

// 암호화 알고리즘은 다양 (복호화가 불가능한 것도 존재)

// 복호화 안되는 걸로
@Service
public class MemberDAO {
	private BCryptPasswordEncoder bcpe; // 복호화 X
	
	public MemberDAO() {
		bcpe = new BCryptPasswordEncoder();
	}
	
	public void login(Member m, HttpServletRequest req) {
		System.out.println(m.getId());
		System.out.println(m.getPw());
		System.out.println(bcpe.encode(m.getPw()));
		
		String dbPw = "1234"; // db에 저장된 비번
		dbPw = bcpe.encode(dbPw); // 인데 암호화 진행된
		System.out.println(dbPw);
		
		// 내가 친 비번을 암호화해서 db에 저장된 암호화된 비번과 비교
		System.out.println(bcpe.matches(m.getPw(), dbPw));
	}
}
