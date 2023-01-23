package com.codewithmash;

import java.util.Scanner;

public class ReadInputFromUser {

	public static void main(String[] args) {
		
		System.out.print("Age: ");
		Scanner sc = new Scanner(System.in);
		byte age=sc.nextByte();
		System.out.println("You are: "+ age);

	}

}
