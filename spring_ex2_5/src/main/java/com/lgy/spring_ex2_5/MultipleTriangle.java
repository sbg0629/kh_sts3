package com.lgy.spring_ex2_5;

import java.util.Scanner;

public class MultipleTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int x= scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		
		Multiple multiple = new Multiple();
		multiple.setA(a);
		
		
		Triangle triangle = new Triangle();
		triangle.setA(x);
		triangle.setB(y);
		triangle.setC(z);
		
		multiple.process();
		triangle.process();
		
	}
}
