package com.codewithmash;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		
		String role = "admin";
		switch (role) {
		case "admin":
			System.out.println("You're an admin");
			break;
		case "moderator":
			System.out.println("You'r a moderator");
			break;
		default:
				System.out.println("You'r a guest");
			
		}

	}

}
