package it.jsystems.dziedziczenie.polimorf;

public class Krem extends Kosmetyk {
	private int spf;
	private static final String kategoria = "krem";

	public Krem(String nazwa, int cena, boolean bio, int spf) {
		super(nazwa, cena, kategoria, bio);
		this.spf = spf;
	}

	public int getSpf() {
		return spf;
	}

	public void setSpf(int spf) {
		this.spf = spf;
	}

	@Override
	public String toString() {
		return super.toString() + " a wartoœæ jego filtra SPF to: " + this.getSpf();
	}
	
	
}
