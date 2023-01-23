package com.codewithmash;

public class CreatingMethod {

	public static void main(String[] args) {
		
		String name = greetUser("Mosh", "Hamedani");
		System.out.println(name);
		
	}
	public static String greetUser(String firstName, String lastName) {
		return "Hello "+ firstName + " "+ lastName;
	}

}
