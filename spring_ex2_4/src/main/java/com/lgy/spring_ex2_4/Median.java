package com.lgy.spring_ex2_4;

public class Median {
	private int a;
	private int b;
	private int c;
	
	public void process() {
		if(((a>=b)&&(b<=c)||((a<=b)&&(a>=c)))) {
			System.out.println("입력된 정수가 "+ a +" "+ b +" "+ c +" "+"의 중간값은 "+a);
		}else if(((b>=a)&&(b<=c))||((b<=a)&&(b>=c))){
			System.out.println("입력된 정수가 "+ a +" "+ b +" "+ c +" "+"의 중간값은 "+b);
		}else {
			System.out.println("입력된 정수가 "+ a +" "+ b +" "+ c +" "+"의 중간값은 "+c);
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
