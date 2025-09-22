package com.lgy.spring_ex2_1;

public class Circle {

	private int r;
	
	public void area() {
		System.out.println("원의 면적은 " + r*r*3.14);
	}
	
	
	
	public double getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	

	
}
