package Afternoon;

public class Animal {
	// ����
	private String race ;
	
	public void sleep() {
		System.out.println("˯��");
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Animal(String race) {
		super();
		this.race = race;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("----����----");
	}
	
}
