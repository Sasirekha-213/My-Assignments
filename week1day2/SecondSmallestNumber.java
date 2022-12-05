package week1.day2assignment.java;

public class SecondSmallestNumber {
	//Assignment No.6
	//Find the Second Smallest Number in the array {23,10,45,67,32,89,22}
	
	 public static void main(String[] args) {
			
		int arr[]= {23,10,45,67,32,89,22};
		
		int min=Integer.MAX_VALUE;
		int s_min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				s_min=min;
				min=arr[i];
			}
			else if (arr[i]<s_min)
			s_min=arr[i];
		}
		System.out.println("Second Smallest Number in the array is: " + s_min);
	 }
	
}
