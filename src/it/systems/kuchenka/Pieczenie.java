package it.systems.kuchenka;

public class Pieczenie implements Kuchenka {

	int czas;
	int temperatura;
	
	@Override
	public void ustawCzas(int minuty) {
		System.out.println("czas pieczenia ustawiony: " + minuty);

	}

	@Override
	public void ustawTemperatur�(int temperatura) {
		System.out.println("temperatura pieczenia ustawiony: " + temperatura);

	}

	@Override
	public void uruchom() {
		System.out.println("w��czam piekarnik");

	}

	@Override
	public void wy��cz() {
		System.out.println("pieczenie zako�czone");

	}

}
