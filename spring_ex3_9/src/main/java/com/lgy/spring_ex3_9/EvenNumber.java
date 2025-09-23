package com.lgy.spring_ex3_9;

public class EvenNumber {
	public void process(int a) {
		int sum = 0;
		
		for(int i =0 ; i<=a; i++) {	
		if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println("10까지의 짝수들의 합계는"+sum);
		
	}
}
