package week1.day1assignment;
//Goal:To understand the object, method and return type.
//a) Create a package by name: week1.day1
//b) Create a class by name: Chrome(with no main method) in the above
//package.
//c) Create a method by name: getName()(i.e.public void getName())
//d) Create a method by name: printName()(i.e.public void printName())
//e) Print a Statement inside the method "This is google Chrome"
//f)Create one more class Name Browser1
//g)Call the method getName(), printName() from Class:
//Browser using object reference
//h)Run Browser1 class and confirm the printed in Console.
public class Chrome {
    public void getName(){
    	System.out.println("This is google Chrome");
    }
	public void printName(){
		System.out.println("This is google Chrome");
	}
    public static void main (String[] args) {
    	Chrome obj = new Chrome();
    	obj.getName();
    	obj.printName();
    }
}
