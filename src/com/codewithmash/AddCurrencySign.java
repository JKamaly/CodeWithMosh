package com.codewithmash;

import java.text.NumberFormat;

public class AddCurrencySign {

	public static void main(String[] args) {
		
//		NumberFormat format = new NumberForat(); the number formal is an abstract class and we can not instantiate an abstract class. 
		//instread we call and use its methods
		
//		NumberFormat currency=NumberFormat.getCurrencyInstance();//change a number to currency and it returns an string result
//		String result =currency.format(1234567.981);
//		System.out.println(result);
		

		
//		NumberFormat percent=NumberFormat.getPercentInstance();
//		String result =percent.format(0.1);
//		System.out.println(result);
		
		extracted();

	}


	public static void extracted() {
		String result =NumberFormat.getPercentInstance().format(0.2);//this is called method chaining 
		System.out.println(result);
	}

}
