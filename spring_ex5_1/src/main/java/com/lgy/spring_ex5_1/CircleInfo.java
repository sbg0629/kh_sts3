package com.lgy.spring_ex5_1;

public class CircleInfo {
	private Circle circle;

	public CircleInfo(Circle circle) {

		this.circle = circle;
	}

	public void getCircleInfo() {
		System.out.println("반지름: "+circle.getRadius());
		System.out.println("원의면적은: "+circle.process());
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	
}
