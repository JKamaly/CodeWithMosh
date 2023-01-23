package com.codewithmash;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		String input = "";
//		while(!input.equals("quit")) {
//			System.out.println("Input: ");
//			input=scanner.next().toLowerCase();
//			if(input.equals("pass"))
//				continue;
//			if(input.equals("quit"))
//				break;
//			System.out.println(input);
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(true) {//when the conition in while loop is assigned to trure, make sure to use brake statement otherwise it will run infinety 
			System.out.println("Input: ");
			input=scanner.next().toLowerCase();
			if(input.equals("pass"))
				continue;
			if(input.equals("quit"))
				break;
			System.out.println(input);
	
		
//		for(int i = 5;i>0;i--)
//			System.out.println("Hello World " + i);
		
//		int i = 5;
//		while(i>0) {
//			System.out.println("Hello World " + i);
//			i--;
		
		
		
		
		}

	}

}
