package com.kdy.practice.i;

import java.util.StringTokenizer;

// 상속
public class JSWMain {
	public static void main(String[] args) {
		String s = "1,22,333";
		
		String[] a = s.split(",");
		for (String string : a) {
			System.out.println(string + "," + string.length());
		}
		System.out.println("--------------");
		StringTokenizer st = new StringTokenizer(s, ",");
		while (st.hasMoreElements()) {
			String ss = st.nextToken();
			System.out.println(ss + "," + ss.length());
		}
//		 StringTokenizer
//				nextToken : 나누는 것만
//				+ 글자수도 (확장)
		
		System.out.println("--------------");
		NewStringTokenizer nst = new NewStringTokenizer(s, ",");
		while (nst.hasMoreElements()) {
			System.out.println(nst.nextToken());
		}
	}
}
