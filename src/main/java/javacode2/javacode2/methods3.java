package javacode2.javacode2;

//public class methods3 {
//	public void dull(String empname) {
//		 System.out.println(empname);
//	}
//	void age(int empage) {
//		System.out.println(empage);
//	}
//	void salary(int empsalary) {
//		System.out.println(empsalary);
//	}                                           // these are the void no return type parameter passing methods 
//public static void main(String[] args) {
//	methods3 m=new methods3();
//	m.dull("rishi");
//	m.age(24);
//	m.salary(25000);
public class methods3 {
public static String dull(String empName) {
String name=empName;
return name; // these method using static and data type string and passing parameter so mentioned return keyword confirm
}                                        //these are static method so we not create object directly call using class and method name
public static void main(String[] args) {
	methods3 m=new methods3();
	System.out.println(methods3.dull("Rishi Gowtham Srinath"));
}
}