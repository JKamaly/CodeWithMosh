package codingWithBro;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//the logical operators are:
		//&& both side of the conditions must be set to true 
		// || if either side of the condition is true it will return true else it returns false
		// ! no will reverse the result of boolean value 
		
//		int temp = 18;
//		
//		if(temp>30) {
//			System.out.println("It's hot outside ");
//		}
//		else if (temp>20 && temp <=30){
//			System.out.println("Its warm outside");
//		}else {
//			System.out.println("It's cold");
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter q or Q to quit the game");
		
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("@")) {
			System.out.println("Quite the game");
		}else {
			System.out.println("You are playing the game");
		}

	}

}
