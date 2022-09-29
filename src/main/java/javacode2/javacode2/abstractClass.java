package javacode2.javacode2;

public abstract class abstractClass {
	public abstract void  tenports();
abstract void programes();

public static void main(String[] args) {

	verified v=new verified();
	v.tenports();
	v.programes();
	
}
}
class verified extends abstractClass{

	@Override
	public void tenports() {
		// TODO Auto-generated method stub
		System.out.println("channel number is 686");
	}

	@Override
	void programes() {
		// TODO Auto-generated method stub
		System.out.println("\nWWE");
		System.out.println("\nFIFA");
		System.out.println("\nUFC");System.out.println("\nAMERICAN OPEN TENNIS");System.out.println("\nASHES CRICKET ENGLAND VS AUSTRALIA");
		

	}
	
}