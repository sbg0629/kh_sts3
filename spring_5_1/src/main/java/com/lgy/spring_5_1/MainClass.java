package com.lgy.spring_5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLOC =  "classpath:application.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLOC);
		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
		//홍길동 만 출력
		studentInfo.getStudentInfo();
		
		//홍길순출력
		Student student2 = ctx.getBean("student2",Student.class);
		studentInfo.setStudent(student2); //바뀐 홍길순이 출력
		studentInfo.getStudentInfo();
		
		ctx.close();//자원반납
	}
}
