package week1.day2assignment.java;

public class ConvertNegativeNumberToPositiveNumber {
//Assignment No.3
	//Problem Statement: Convert a Negative Number to Positive Number
	//Pseudo Code:
	//1.Initialize an integer with a negative number like, int number = -40.
	//2.Check if the number is a negative number. Hint:Any number that is lesser
	//than zero is a negative number.
	//3.If so, convert the number to a positive number.
	//4.Print as below "The number -40 is converted to 40".
		public static void main(String[] args) {
			int number = -40;
			int convert;
			if (number<0) {
				System.out.println("Negative Number = "+ number);
			}else {
				System.out.println("Positive Number = "+ number);
			}
	        convert = number * (-1);
	        System.out.println("Positive Number = " + convert);
	        System.out.println("The Number "+ number +" is converted to Positive");
		}
		
		
}
