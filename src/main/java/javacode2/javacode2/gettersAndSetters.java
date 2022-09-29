package javacode2.javacode2;

public class gettersAndSetters {
	private String actor;
	private String movie;
	private int releasedyear;
	
	

	public String getActor() {
		return actor;
	}



	public void setActor(String actor) {
		this.actor = actor;
	}



	public String getMovie() {
		return movie;
	}



	public void setMovie(String movie) {
		this.movie = movie;
	}



	public int getReleasedyear() {
		return releasedyear;
	}



	public void setReleasedyear(int releasedyear) {
		this.releasedyear = releasedyear;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 gettersAndSetters g=new gettersAndSetters();
		 g.setActor("Raiini");
		 g.setMovie("Thalapathy");
		 g.setReleasedyear(1991);
		 System.out.println("\nActor :"+g.getActor()+"\nMovie :"+g.getMovie()+"\nReleased year :"+g.getReleasedyear());
		 gettersAndSetters g2=new gettersAndSetters();
		 g2.setActor("Ajith");
		 g2.setMovie("Dheena");
		 g2.setReleasedyear(2001);
		 System.out.println("\nActor :"+g2.getActor()+"\nMovie :"+g2.getMovie()+"\nReleased year :"+g2.getReleasedyear());
	}



	public gettersAndSetters() {
		super();
		this.actor = actor;
		this.movie = movie;
		this.releasedyear = releasedyear;
	}
}
