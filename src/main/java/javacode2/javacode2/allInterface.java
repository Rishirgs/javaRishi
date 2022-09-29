package javacode2.javacode2;

public class allInterface extends mock implements dull,rock {
	public void telecast() {
		// TODO Auto-generated method stub
System.out.println("TELECAST IN : ESPN");		
	}

	@Override
	public void playername() {
		// TODO Auto-generated method stub
		System.out.println("PLAYER NAME : LIONEL MESSI");
	}

	@Override
	public void playerPlace() {
		// TODO Auto-generated method stub
		System.out.println("PLAYER PLACE BARELONA");
	}

	@Override
	public void playerage() {
		// TODO Auto-generated method stub
		System.out.println("AGE : 25");
	}

	@Override
	public void city() {
		// TODO Auto-generated method stub
		System.out.println("BIRTH PLACE : BRAZIL");
	}


public static void main(String[] args) {
		// TODO Auto-generated method stub
	allInterface i=new allInterface();
	i.playername();
	i.city();
	i.playerage();
	i.playerPlace();
	i.telecast();
}	
}
interface dull{
	public void playername();
	public void playerPlace();
	public void playerage();
}
 abstract class mock{
	public abstract void telecast();
}
 interface rock{
	 public void city();
 }