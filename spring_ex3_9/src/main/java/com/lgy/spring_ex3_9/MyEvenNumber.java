package com.lgy.spring_ex3_9;

public class MyEvenNumber {
	private EvenNumber evenNumber;
	private int a;
	
	public void even() {
		evenNumber.process(a);
	}
	
	public EvenNumber getEvenNumber() {
		return evenNumber;
	}
	public void setEvenNumber(EvenNumber evenNumber) {
		this.evenNumber = evenNumber;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}
