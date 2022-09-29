package javacode2.javacode2;

public class constructor {
	int a,b,c;
public constructor(int i) {
	
		// TODO Auto-generated constructor stub
	a=i;
	}

public constructor(int i, int j) {
	// TODO Auto-generated constructor stub
	a=i;
	b=j;
}

public constructor(int i, int j, int k) {
	// TODO Auto-generated constructor stub
	a=i;
	b=j;
	c=k;
}

public constructor() {
	// TODO Auto-generated constructor stub
a=100;b=600;

}
int sub() {
	return a-b;
}
int add() {
int value=0;
value=a+90;
return value;
}
int mul(){
	int value=a*b;
	return value;
}
int div() {
	int value=0;
	value=a*b*c/2;
	return value;
}
public static void main(String[] args) {
	constructor c1=new constructor();
	constructor c2=new constructor(10);
	constructor c3=new constructor(200,59);
	constructor c4=new constructor(1000,500,700);
	System.out.println(c1.sub());
	System.out.println(c2.add());
	System.out.println(c3.mul());
	System.out.println(c4.div());
}
}
