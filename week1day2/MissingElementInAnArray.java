package week1.day2assignment.java;

import java.util.Arrays;

public class MissingElementInAnArray {
	    //Assignment No:7
		// Here is the input
		// Sort the array	
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
	
		public static void main(String[] args) {
		// Here is the input		
		int arr[] = {1,2,3,4,7,6,8};
		//Sort the array	
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)	
		for(int i=1;i<arr.length+1;i++) {
		//check if the iterator variable is not equal to the array values respectively	
		if(arr[i-1]!=i) {
		//print the number			
		System.out.println("The Missing Element in the array is: " + i);
		//once printed break the iteration
		break;
			} 
			
		}

	}
	
}
