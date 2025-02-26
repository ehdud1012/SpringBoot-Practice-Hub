package com.kdy.practice.i;

import java.util.StringTokenizer;

public class NewStringTokenizer extends StringTokenizer{

	

	public NewStringTokenizer(String str, String delim) {
		super(str, delim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String nextToken() {
		String s = super.nextToken();
		return s + ", " + s.length();
	}

}
