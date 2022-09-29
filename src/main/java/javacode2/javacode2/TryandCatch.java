package javacode2.javacode2;

public class TryandCatch {

	public static void main(String[] args) {
		int[] a=new int[3];
		try {
			for(int i=0;i<=a.length;i++)
			{	
				System.out.println(i);
				}
				
			}

		catch(Exception e) {
			System.err.println("error occured");
		}
}
}