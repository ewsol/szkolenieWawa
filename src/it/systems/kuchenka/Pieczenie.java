package it.systems.kuchenka;

public class Pieczenie implements Kuchenka {

	int czas;
	int temperatura;
	
	@Override
	public void ustawCzas(int minuty) {
		System.out.println("czas pieczenia ustawiony: " + minuty);

	}

	@Override
	public void ustawTemperaturê(int temperatura) {
		System.out.println("temperatura pieczenia ustawiony: " + temperatura);

	}

	@Override
	public void uruchom() {
		System.out.println("w³¹czam piekarnik");

	}

	@Override
	public void wy³¹cz() {
		System.out.println("pieczenie zakoñczone");

	}

}
