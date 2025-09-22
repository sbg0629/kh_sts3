package com.lgy.spring_ex2_1;

public class Draw {
public static void main(String[] args) {
//	DRAW 클래스가 circle 클래스에 의존
	Circle circle = new Circle();
	//의존+주입 (dependency injection) :DI
	circle.setR(10);
	circle.area();
	
	//의존+주입 (dependency injection):Di
	Rectangle rectangle = new Rectangle();
	rectangle.setW(20);
	rectangle.setH(30);
	rectangle.rectangle();
	
}
}
