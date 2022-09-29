package javacode2.javacode2;

public class InterfaceThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread();
t.start();

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

	}