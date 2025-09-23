package com.lgy.spring_ex3_8;

public class Median {
	public void process(int a,int b, int c) {
		if(((a>=b)&&(b<=c)||((a<=b)&&(a>=c)))) {
			System.out.println("입력된 정수가 "+ a +" "+ b +" "+ c +" "+"의 중간값은 "+a);
		}else if(((b>=a)&&(b<=c))||((b<=a)&&(b>=c))){
			System.out.println("입력된 정수가 "+ a +" "+ b +" "+ c +" "+"의 중간값은 "+b);
		}else {
			System.out.println("입력된 정수가 "+ a +" "+ b +" "+ c +" "+"의 중간값은 "+c);
		}
	}
}
