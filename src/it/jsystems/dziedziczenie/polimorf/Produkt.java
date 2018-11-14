package it.jsystems.dziedziczenie.polimorf;

public class Produkt {

	private String nazwa;
	private int cena;

	public Produkt(String nazwa, int cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getCena() {
		return cena;
	}

	@Override
	public String toString() {
		return this.getNazwa().toString().concat(" cena: " + String.valueOf(this.getCena()));
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

}
