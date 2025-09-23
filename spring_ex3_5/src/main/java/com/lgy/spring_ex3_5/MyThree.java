package com.lgy.spring_ex3_5;

public class MyThree {
	private Three three;
	private int a;
	
	public void th() {
		three.process(a);
	}
	
	public Three getThree() {
		return three;
	}
	public void setThree(Three three) {
		this.three = three;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	
}
