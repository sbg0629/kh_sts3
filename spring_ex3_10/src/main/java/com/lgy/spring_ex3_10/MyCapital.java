package com.lgy.spring_ex3_10;

public class MyCapital {
	private Capital capital;
	private String eng;
	
	public void cap() {
		capital.alphabet(eng);
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}
	
	
}
