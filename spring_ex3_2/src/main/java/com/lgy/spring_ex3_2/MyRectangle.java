package com.lgy.spring_ex3_2;

public class MyRectangle {
	private Rectangle rectangle;
	private int width;
	private int hight;
	
	public void area1() {
		rectangle.area(width, hight);
	}
	
	
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	
}
