package it.jsystems.abstracts;

public abstract class Mammal extends Animal {
	
	boolean isPredator;

	public Mammal(String name, int age, boolean isPredator) {
		super(name, age);
		this.isPredator = isPredator;
	}

	public boolean isPredator() {
		return isPredator;
	}

	public void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}
	

}
