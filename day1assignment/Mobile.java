package week1.day1assignment;
//Create package name as week1.day1 under src/main/java
//Create a new Class as "Mobile" under week1.day1
//Create 2 methods (Makecall(), Sendmsg()) with Simple print Statement
//In first method create variable is Full Charged (boolean), 
//mobile Cost(int)
//Create main method 
//Create object for class and call from main method and print them
//print a Statement "This is my mobile"
//run and confirm the output printed in console.

public class Mobile {
	public void Makecall() {
		boolean  visible = true; //Full Charged
	    int mobileCost = 30000;
	   
	}
    public void Sendmsg() {
       
		System.out.println("This is my mobile");
		}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.Makecall();
		obj.Sendmsg();
}
}