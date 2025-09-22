package com.lgy.spring_ex3_1;

public class MyCircle {
	private Circle circle;
	private int rad;
	
	public void area1() {
		circle.area(rad);
	}
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	
}
