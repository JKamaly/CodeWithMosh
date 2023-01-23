package com.codewithmash;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//Logical operators are: And, OR
		
//		int temprature = 22;
//		boolean isWarm = temprature >20 && temprature<30;
//		System.out.println(isWarm);
		
//		boolean hasHighIncome = false;
//		boolean hasGoodCredit = true;
//		boolean isEligible = hasHighIncome || hasGoodCredit;
//		System.out.println(isEligible);
		
		boolean hasHighIncome = false;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);
		
	

	}

}
