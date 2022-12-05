package week1.day2assignment.java;

public class PrimeNumber {
	//Assignment No:1

		/*
		 * Goal: To find whether a number is a Prime number or not
		 * input: 13
		 * output: 13 is a Prime Number
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)To find whether a number is a Prime number or not
		 * 2)How to provide for loop variable and check the condition
		 * 3)How to provide 'if' & 'else'condition and check the condition
		 */

		public static void main(String[] args) {

			// Declare an int Input and assign a value 13			
				int input = 13;
			// Declare a boolean variable flag as false
				Boolean flag = false;
			// Iterate from 2 to half of the input
			    int num=input/2;
			// Divide the input with each for loop variable and check the remainder
				for(int i=2;i<=num;i++)
					{
						if(input%i==0)
							{
			// Set the flag as true when there is no remainder				
							flag = true;
			// Print 'Not a Prime' when the condition doesn't match 
							System.out.println("The flag is " + flag);
							System.out.println("The Number is Not a Prime " + input);
					// break the iterator
							break;
										}
			// Check the flag (Provide a condition)	
						else
			
						{
			// Print 'Prime' when the condition matches
							flag = false;
							System.out.println("The flag is "+ flag);
							System.out.println("The Number is  Prime " + input);
							break;
							}
					}
				
			}
}
