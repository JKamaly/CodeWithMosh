package com.codewithmash;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String [] fruits = {"Apple", "Mango", "Orange"};
		
//		for(int i = 0; i<fruits.length;i++)
//			System.out.println(fruits[i]);
		
		for(String fruite:fruits)
			System.out.println(fruite);

	}

}
