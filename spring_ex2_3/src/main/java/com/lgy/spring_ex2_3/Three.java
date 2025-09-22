package com.lgy.spring_ex2_3;

public class Three {
	private int a;

	public  void three() {
		if(a%3==0) {
			System.out.println("3의배수입니다");
		}else
			System.out.println("3의 배수가 아닙니다");
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
