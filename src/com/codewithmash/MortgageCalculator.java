package com.codewithmash;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
			
		int principle=(int)readNumber("Principle: ", 1000, 1_000_000);
		float annualInterest=(float)readNumber("Anual Interest Rate:  ", 1, 30);
		byte years=(byte)readNumber("Period (Years): ", 1, 30);

		double mortgage = calculateMortgage(principle, annualInterest, years);
		String mortgageFormatted =NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		
	}
	public static double readNumber(String prompt, double min, double max) {
		Scanner scanner = new Scanner(System.in);
		
		double value;
		while(true) {
			System.out.println(prompt);
			 value = scanner.nextByte();
			if(value >=min && value<=max) 
			break;
			
			System.out.println("Enter a value between" + min + " and" + max);
			}
		return value;
	}
	
	public static double calculateMortgage(int principle, float annualInterest,byte years ) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		float monthlyInterest = annualInterest / PERCENT/MONTHS_IN_YEAR;
		short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
		
		double mortgage = principle 
			      *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
			      / (Math.pow(1 + monthlyInterest, numberOfPayments)-1);
	
	return mortgage;
		
	}

}
