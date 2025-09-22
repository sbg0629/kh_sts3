package com.lgy.spring_ex2_5;

public class Triangle {
	private int a;
	private int b;
	private int c;
	
	public void process() {
		if(((a+b)>c||((a+c)>b)||((b+c)>a))) {
			System.out.println("삼각형이 됩니다");
		}else {
			System.out.println("삼각형을 만들 수 없습니다");
		}
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	
}
