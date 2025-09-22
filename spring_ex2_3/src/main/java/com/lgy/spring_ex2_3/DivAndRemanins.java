package com.lgy.spring_ex2_3;

public class DivAndRemanins {

	private int a;
	
	public void div() {
		//int ten = a/10;
		//int one = a/10;
		//이렇게도 가능하다.
		if(a%10 == a/10 ) {
			System.out.println("10의자리와 1의 자리가 같습니다");
		}else
			System.out.println("10의자리와 1의자리가 다르다");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
}
