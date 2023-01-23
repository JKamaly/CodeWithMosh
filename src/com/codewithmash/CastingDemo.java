package com.codewithmash;

public class CastingDemo {

	public static void main(String[] args) {
		
		//implicit casting 
		//byte > short> int > long> float> double 
//		short x= 1;
//		int y = x+2;
//		System.out.println(y);
		
//		String x= "1";
//		int y = Integer.parseInt(x)+2;
//		System.out.println(y);
		
//		String x= "1.2";
//		double y = Double.parseDouble(x)+2;
//		System.out.println(y);
		
		String x= "1";
		short y = (short) (Short.parseShort(x)+2);
		System.out.println(y);
		
		
		

	}

}
