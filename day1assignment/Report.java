package week1.day1assignment;
//Create a Class Report and create object for student class in main method
//and print all the variables.
public class Report {
	public void Studentname(){
		System.out.println("SASIREKHA KOSALRAM");
		}
	public void RollNo(){
		System.out.println("326359743");
		}
	public void CollegeName(){
		System.out.println("B.S.ABDUR RAHMAN CRESCENT ENGG COLLEGE");
		}
	public void Markscored(){
		System.out.println("83%");
		}
	public void CGPA(){
		System.out.println("3.5");
		}
public static void main (String [] args) {
	Report obj = new Report();
	obj.Studentname();
	obj.RollNo();
	obj.CollegeName();
	obj.Markscored();
	obj.CGPA();
}
}
