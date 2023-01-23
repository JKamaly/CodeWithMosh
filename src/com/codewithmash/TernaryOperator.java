package com.codewithmash;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int income = 90_000;
		//Ternary has three peices: condition, '?' first condition ':' and second condition
		String className = income>100_000 ? "First": "Economy";
		
		System.out.println(className);
		
	

	}

}
