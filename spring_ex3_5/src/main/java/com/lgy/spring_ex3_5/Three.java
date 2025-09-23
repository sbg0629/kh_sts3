package com.lgy.spring_ex3_5;

public class Three {
	public void process(int a) {
		if(a%3==0) {
			System.out.println("입력된 수: "+a+"는 3의 배수 입니다");
		}else {
			System.out.println("입력된 수: "+a+"는 3의 배수 아닙니다.");
		}
	}
}
