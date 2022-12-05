package week1.day2assignment.java;
//Classroom No.1
//Print if the given number is odd or even
//Goal: To understand the mod operator, conditional statement and logic
//writing
//a)Create a class by name: OddOrEven1
//b)Create a main method using shortcut
//c)Declare a class variable of type of int with a value as input
//d)Write a logic to print if the given input is odd or even
//Hint:Divide the given input by 2 and if the remainder is o-->even else
//odd.Use mod(%) operator to find remainder.
public class OddOrEven {
	public static void main(String[] args) {

		  int num = 10; //12345689 10
	        for (int i = 1; i <= num; i++) {
	        	 System.out.println(i);
	            
	            if ((i) % 2 == 0) {
	                System.out.println( "Even");
	            }
	            else {
	                System.out.println("ODD ");
	            }
	    }
	}
		

}