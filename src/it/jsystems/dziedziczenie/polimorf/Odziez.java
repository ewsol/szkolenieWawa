package it.jsystems.dziedziczenie.polimorf;

public class Odziez extends Produkt {
	
	private String rozmiar;
	
	public Odziez(String nazwa, int cena, String rozmiar) {
		super(nazwa, cena);
		this.rozmiar = rozmiar;
	}

	public String getRozmiar() {
		return rozmiar;
	}

	public void setRozmiar(String rozmiar) {
		this.rozmiar = rozmiar;
	}
	
}
