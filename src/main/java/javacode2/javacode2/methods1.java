package javacode2.javacode2;

public class methods1 {
public void add() {    //void is present so it is not return type
	int x=10;
	int y=20;
	System.out.println(x+y);
}
public void sub(int x, int y) {    //void is present not return type, then we passed a parameter
	System.out.println(x-y);
	
}
public int mul() {    //no void there is a data types so we as return values 
	int x=10,y=30,a=0;
	a=x*y*2;
	return a;
}
public int div(int x,int y) {
	int value=0;
	value=x*y/2;
	return value;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
methods1 m=new methods1();
m.add();
m.sub(50000, 7234);
System.out.println("multiply value "+m.mul());
System.out.println("division value "+m.div(152, 12));
	}
}
