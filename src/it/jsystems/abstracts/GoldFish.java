package it.jsystems.abstracts;

public class GoldFish extends Fish {
	
	String breed;

	public GoldFish(String name, int age, boolean slodkowodna, String breed) {
		super(name, age, slodkowodna);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
