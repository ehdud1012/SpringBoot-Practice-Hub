package com.kdy.oct311jpa.snack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 실무
//		프로젝트 시작 -> 설계 -> DB -> 프로그램 개발
// JPA
//		- 테이블 만들기 기능이 있음 - 무쓸모
//		- 이미 존재하는 테이블에 연결 기능이 중요
//		- MyBatis처럼 DB필드명 = 멤버변수명 자동 연결
//			근데 ! 멤버변수명에 _들어가면 인식못함
//			근데 DB는 s_name인뎅..
//			DB 필드명 != 멤버변수명 => 자동 연결 X
//			@Column(name = "s_name") 수동으로 멤버변수 위에 붙여주기

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "oct31_snack") // 테이블명 oct31_snack 에 연결
public class Snack {
	// DB 필드명 != 멤버변수명 => 자동 연결 X
	
	// 멤버변수 자료형 객체형으로
	@Id // Primary Key
	@Column(name = "s_name") 
	private String name;
	
	@Column(name = "s_price")
	private Integer price;
}
