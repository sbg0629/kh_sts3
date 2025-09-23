package com.lgy.spring_5_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

	String configLoc =	"classpath:application.xml";
	AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
	/*
	Pencil6BWithEraser pencil1 = ctx.getBean("pencil1",Pencil6BWithEraser.class);
	pencil1.use();
	Pencil6B pencil2 = ctx.getBean("pencil2",Pencil6B.class);
	pencil2.use();
	Pencil4B pencil3 = ctx.getBean("pencil3",Pencil4B.class);
	pencil3.use();
	}
	*/
	//인터페이스도 사용 가능(참조변수는 인터페이스로 받으면 됨.)
	Pencil pencil1 = ctx.getBean("pencil1",Pencil.class);
	pencil1.use();
//	use오버라이딩 메소드 호출
	Pencil pencil2 = ctx.getBean("pencil2",Pencil.class);
	pencil2.use();
	
	Pencil pencil3 = ctx.getBean("pencil3",Pencil.class);
	pencil3.use();
	
	ctx.close();
	}
}
