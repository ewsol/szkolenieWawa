package it.jsystems.abstracts;

public class Human extends Mammal {
	public Human(String name, int age, boolean isPredator, String race) {
		super(name, age, isPredator);
		this.race = race;
	}
	public String race;

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	
	

}
