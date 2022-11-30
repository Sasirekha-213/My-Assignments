package week1.day1assignment;
//Create package name as week1.day1 under src/main/java
//Create 2 methods: (applyBreak(), soundHorn())
//applyBreak(){print as Applied break}
//soundHorn(){print as Sound horn}
//Create another class as Bike
//Call the methods of Car class in Bike class by creating object for Car 
//class and Bike class
//Hint: Create two objects for the two classes.

public class Car {
public void applyBreak() {
	System.out.println("Applied break");
}
public void soundHorn() {
	System.out.println("Sound horn");
}
public static void main (String[] args) {
	Car obj = new Car();
	obj.applyBreak();
	obj.soundHorn();
}
}
