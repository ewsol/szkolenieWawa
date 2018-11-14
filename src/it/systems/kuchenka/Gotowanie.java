package it.systems.kuchenka;

import java.util.Scanner;


public class Gotowanie {

	private void main() {
		Scanner scanner = new Scanner(System.in);
		String operacja = scanner.nextLine();
		scanner.close();

		int czas = 60;
		int temperatura = 210;
		Kuchenka kuchenka = new Pieczenie();

		if ("G".equalsIgnoreCase(operacja)) {
			czas = 20;
			kuchenka = new Grillowanie(czas);
			temperatura = 180;
		}

		przygotujKurczaka(czas, temperatura, kuchenka);
	}

	private void przygotujKurczaka(int czas, int temperatura, Kuchenka gotuj) {
		gotuj.ustawCzas(czas);
		gotuj.ustawTemperaturê(temperatura);
		gotuj.uruchom();
		gotuj.wy³¹cz();
	}	
	
}
