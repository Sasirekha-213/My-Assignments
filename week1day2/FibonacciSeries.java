package week1.day2assignment.java;

public class FibonacciSeries {
	
	    //Assignment No.8
		/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		 * 
		 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
		 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
		 * enter
		 * 
		 * What are my learnings from this code? 
		 * 1)Learn to write the code for the Fibonacci Series for a given range
		 * 2)Learn to initialize 3 int variables
		 * 3)How to provide for loop variable and check the condition
		 */
		 
		public static void main(String[] args) {

			// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			int inputrange =8;
			int firstNum=0;
			int secondNum=1;
			int sum;
			// Print first number
			System.out.println(firstNum);
			// Iterate from 1 to the range
			for (int i=1; i<inputrange-1; i++) {
			// add first and second number assign to sum
		    sum = firstNum+secondNum;
		    // Assign second number to the first number
		    firstNum=secondNum;
			// Assign sum to the second number
		    secondNum = sum;
			// print sum
		    System.out.println(sum);
            }
      }	
}
