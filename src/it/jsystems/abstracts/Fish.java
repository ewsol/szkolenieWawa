package it.jsystems.abstracts;

public abstract class Fish extends Animal {
	
	boolean slodkowodna;

	public Fish(String name, int age, boolean slodkowodna) {
		super(name, age);
		this.slodkowodna = slodkowodna;
	}

	public boolean isSlodkowodna() {
		return slodkowodna;
	}

	public void setSlodkowodna(boolean slodkowodna) {
		this.slodkowodna = slodkowodna;
	}
	public void p³ywaj() {
		System.out.println("rybka lubi p³ywaæ");
	}
	
}
