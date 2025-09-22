package com.lgy.spring_ex2_5;


public class Asterisk {
	private int a;

	public void process() {
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = a; i>0; i--) {
			for (int j = 0; j < i; j++) {
				stringBuffer.append('*');				
			}
			stringBuffer.append("\n");
		}
		System.out.println(stringBuffer);
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
