package com.lgy.spring_ex2_5;

public class Capltal {
	private String str;

	public void process() {
		StringBuffer stringBuffer = new StringBuffer();
		
		char c='A';
		char c2 = str.charAt(0);	
		
		for(char i = c2; i>=c;i--) {
			for(char j = c; j<=i;j++) {
				stringBuffer.append(j);				
			}
			stringBuffer.append("\n");
		}
		System.out.println(stringBuffer);
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	
}
