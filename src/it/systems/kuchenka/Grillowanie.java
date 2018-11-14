package it.systems.kuchenka;

public class Grillowanie implements Kuchenka {
	public Grillowanie(int minuty) {
		super();
		this.minuty = minuty;
	}

	int minuty;
	
	@Override
	public void ustawCzas(int minuty) {
		System.out.println("czas grillowania ustawiony: " + minuty);

	}

	@Override
	public void ustawTemperatur�(int temperatura) {
		System.out.println("temperatura grillowania ustawiona: " + temperatura);

	}

	@Override
	public void uruchom() {
		System.out.println("w��czam grill");

	}

	@Override
	public void wy��cz() {
		System.out.println("grillowanie zako�czone");

	}

}
