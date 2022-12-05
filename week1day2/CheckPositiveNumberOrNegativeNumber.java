package week1.day2assignment.java;
//Assignment No.4
//Problem Statement:Check if the number is Positive or Negative.
//Pseudocode: 1.Initialize a number,say,int number=35;
//2.If a number is Positive, print "The Number is Positive";
//3.If a number is Negative, print "The Number is Negative";
//4.If it is neither Positive nor Negative, print as "The Number is neither
//Positive nor Negative".
public class CheckPositiveNumberOrNegativeNumber {
	
	public static void main(String[] args) {
		
		int num = 35;
		if(num > 0) {
			System.out.println("The Number is Positive");
		}else if(num < 0) {
			System.out.println("The Number is Negative");
		}else {
			System.out.println("The Number is neither Positive nor Negative");
	    }
	}
}
