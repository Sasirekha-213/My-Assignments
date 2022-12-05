package week1.day2assignment.java;
	//Classroom No.3
	//Find the max and min values of the int array
	//int[]nums={22,3981,-19,82,0,45,37};
	//max-->3981
	//min-->-19
	//Goal: To understand the Arrays, sort
	//a)Create a class by name:FindMinMax(with main method)in same package.
	//b)Create a int[] array with different data not in sorted order.
	//c)Write a logic to sort and find the min,max
	//d)Run and Confirm the correct values are printed in console
	//Hint:Use sort and find the min and second max by indices
	import java.util.Arrays;

	public class FindMinMax {
		
		public static void main(String[] args) {
			//To do Auto-generated method stub
			int [] numbers= {22,3981,-19,82,0,45,37};
			int length = numbers.length;
			//minimum value arr[-19]--> marks[0]-->-19
			//maximum value arr[length-1] marks[5]-->3981
		Arrays.sort(numbers);
		    for(int i=0;i<=length;i++)  
		    	if(i==numbers[0]);
			System.out.println(numbers[0]+"=min");
		    System.out.println(numbers[length-1]+"=max");
		    
		}
}
