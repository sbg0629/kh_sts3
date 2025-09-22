package com.lgy.spring_ex2_1;

public class Rectangle {
	private int w;
	private int h;
	
	public void rectangle() {
		System.out.println("사각형의 면적은 "+w*h);		
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
}
