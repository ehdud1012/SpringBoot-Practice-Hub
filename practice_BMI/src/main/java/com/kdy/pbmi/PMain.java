package com.kdy.pbmi;

import java.util.Scanner;

public class PMain {
	public static void main(String[] args) {
		Scanner consoleInputSupporter = new Scanner(System.in);
		
		System.out.print("이름");
		String name = consoleInputSupporter.next();
		
		System.out.print("키 : ");
		double height = consoleInputSupporter.nextDouble();
		System.out.print("몸무게 : ");
		double weight = consoleInputSupporter.nextDouble();
	}
}
