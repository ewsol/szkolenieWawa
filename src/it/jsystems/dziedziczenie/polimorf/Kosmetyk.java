package it.jsystems.dziedziczenie.polimorf;

public class Kosmetyk extends Produkt {

	private String kategoria;
	private boolean bio;

	public Kosmetyk(String nazwa, int cena, String kategoria, boolean bio) {
		super(nazwa, cena);
		this.kategoria = kategoria;
		this.bio = bio;
	}

	public String getKategoria() {
		return kategoria;
	}

	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}

	public boolean isBio() {
		return bio;
	}

	public void setBio(boolean bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "kategoria: " + this.kategoria.toString() + " " + super.toString() ;
	}

}
