package com.kdy.practice.main;

// Call By Reference, Call By Value
// 값을 넣어 호출, 주소로 호출
// CBV :함수에서 건드려도 원본에 영향이 안감
//		가게 하려면 return 사용
// CBR :함수에서 건들면 원본에 영향이 감

public class JFWMain {

	public static void printAge(int age, Dog d) {
		System.out.println(age); // 10
		System.out.println(d.age); // 10
		System.out.println("--------------");
		age = 30;
		d.age = 30;
		System.out.println(age); // 30
		System.out.println(d.age); //30
		System.out.println("--------------");
	}
	
	public static void main(String[] args) {
		int age = 10;
		Dog d = new Dog(); // 설명하려고 대충 만듬
		d.age = 10;
		
		System.out.println(age); // 10
		System.out.println(d.age); // 10
		System.out.println("--------------");
		printAge(age, d);
		System.out.println(age); // 10
		System.out.println(d.age); // 30
		System.out.println("--------------");
	}
}
