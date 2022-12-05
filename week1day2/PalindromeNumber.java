package week1.day2assignment.java;

public class PalindromeNumber {
	//Assignment No.2
	//Check the given number is Palindrome or not
	//Int num = 34343
	//Initialize a temporary variable
	//Reverse the number(using for loop and add to the temporary number)
	//with reversed number
	//If both numbers are same, print "Palindrome Number"
	//Else print "Not a Palindrome Number"

	public static void main(String[] args) {
		
		int number = 34343;
		int rem;
		int sum=0;
		int number1=number;
		
		for(int i=0; i<=4; i++)
		{
			
		//logic to find the Palindrome Number
		rem=number%10;
		sum = ((sum*10)+rem);
		number=number/10;
					
		}
		//System.out.println(sum);
		//System.out.println(number);
		
		if (sum==number1)
		{
			System.out.println(" The Number is a Palindrome");
			} 
		else
		{
		System.out.println(" The Number is Not a Palindrome");
		}
	
	}
					
}
