package javacode2.javacode2;

public class Threadbasics extends Thread {
	public void run() {
	for(int i=1;i<=5;i++) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(i);	
	}
	}
public static void main(String[] args) {
	Threadbasics t=new Threadbasics();
	t.start();
	try {
		t.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	tell t1=new tell();
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("end of program");
	
		
}
}
class tell extends Thread{
	public void run() {{
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(i);	
			}
			}
	}
}
