package com.lgy.spring_ex2_5;

public class Multiple {
	private int a;
	
	public void process() {
		boolean mult =false;
		if(a%3==0) {
			System.out.println("3의 배수입니다");
			mult = true;
		}if(a%5==0) {
			System.out.println("5의배수입니다");
			mult = true;
		}if(a % 8 == 0) {
			System.out.println("8의 배수입니다");
			mult = true;
		}if(!mult) {
			System.out.println("어느 배수도 아님");
		
			
		}
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
