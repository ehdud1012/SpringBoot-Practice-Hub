package com.kdy.oct291l.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	private String name;
	private int price;
	private int num;
	
//	 기본생성자/오버로딩생성자/gt,st
//			=> JavaBean의 기본 , 그럼 자동으로 -> lombok
//	
//	 lombok 
//			- Spring Legacy 에서도 쓸 수 있지만 신기술이니까 자제 한거임
//			- @Data 붙이면 끝
//			=> 근데 ! eclipse가 소스상으로 나타나지 않아서 인식을 잘 못행 
//				- 설정
}
