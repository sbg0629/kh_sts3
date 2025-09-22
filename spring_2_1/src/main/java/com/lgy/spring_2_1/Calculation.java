//도메인 역순 (패키지 lgy legacy + spring_2_1 프로젝트 이름 포함)
package com.lgy.spring_2_1;

public class Calculation {
	private int fristNum;
	private int secondNum;
	
	public void add() {
		System.out.println("add");
		System.out.println(fristNum+"+"+secondNum+"="+(fristNum+secondNum));
	} 
	
	public void sub() {
		System.out.println("sub");
		System.out.println(fristNum+"-"+secondNum+"="+(fristNum-secondNum));
	} 
	
	public void mul() {
		System.out.println("mul");
		System.out.println(fristNum+"*"+secondNum+"="+(fristNum*secondNum));
	} 
	
	public void div() {
		System.out.println("div");
		System.out.println(fristNum+"/"+secondNum+"="+(fristNum/secondNum));
	} 
	
	public int getFristNum() {
		return fristNum;
	}
	public void setFristNum(int fristNum) {
		this.fristNum = fristNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
	
}
