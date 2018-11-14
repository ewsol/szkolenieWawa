package it.jsystems.wzorce;

import java.util.Date;
// wzorzec Builder

public class Pracownik {

	private String imiê;
	private String nazwisko;
	private Date dataZatrudnienia;
	
	public Pracownik() {
		
	}

	public static class PracownikBuilder {

		public Pracownik pracownik = new Pracownik();

		public PracownikBuilder withImie(String imie) {
			pracownik.imiê = imie;
			return this;
		}

		public PracownikBuilder withNazwisko(String nazwisko) {
			pracownik.nazwisko = nazwisko;
			return this;
		}

		public PracownikBuilder withDataZatrudnienia(Date dataZatrudnienia) {
			pracownik.dataZatrudnienia = dataZatrudnienia;
			return this;
		}

		public Pracownik build() {
			return pracownik;
		}

	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pracownik [imiê=");
		builder.append(imiê);
		builder.append(", nazwisko=");
		builder.append(nazwisko);
		builder.append(", dataZatrudnienia=");
		builder.append(dataZatrudnienia);
		builder.append("]");
		return builder.toString();
	}


	public static void main(String[] args) {
		Pracownik p = new Pracownik.PracownikBuilder()		
				.withImie("Ewa")
				.withNazwisko("Solnica")
				.withDataZatrudnienia(new Date())
				.build();
		
		System.out.println(p);
	}

}
