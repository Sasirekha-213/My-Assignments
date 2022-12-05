package week1.day2assignment.java;
//Classroom No.2
public class Calculator {
	public int add(int a,int b,int c) {
		//int f = a+b+c;
		return a+b+c;
	}
	/*
	 * public void sub() {a-b};
	//public int sub(int a,int b) {
		//int c = a-b;
		//return a-b;
	*/
	public double sub (double d,double e) {
		return d-e;
	}
	public double mul (double p,double q) {
		return p*q;
	}
	public double div(double x,double y) {
		//System.out.println(x/y);
		return x/y;
	}
	public static void main(String[] args) {
		Calculator fun=new Calculator();
		int add = fun.add(33, 30, 39);
		System.out.println(add);
		System.out.println(fun.sub(3.27, 2.19));
		System.out.println(fun.mul(2.59, 3.72));
		System.out.println(fun.div(3.66, 2.11));
		
	}
	
}
