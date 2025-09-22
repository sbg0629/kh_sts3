package com.lgy.spring_ex2_2;

public class SeasonDollar {

	public static void main(String[] args) {
		Season season = new Season();
		season.setM(9);
		season.mon();
		
		Won2dollar won2dollar = new Won2dollar();
		won2dollar.setWon(3300);
		won2dollar.dollar();
	}
}
