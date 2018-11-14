package it.jsystems.opeacjepliki;

import java.io.File;
import java.util.Scanner;

public class Pliki {

	public static void main(String[] args) {
		zadanie();
	}

	private static void przyklad1() {
		File plik = new File("C:/test.txt");
		System.out.println("Czy jest to plik? : " + plik.isFile());
		System.out.println("Nazwa: " + plik.getName());

		File nowyKatalog = new File("C:/d3");
		boolean utworzono = nowyKatalog.mkdir();

		System.out.println("Utworzono katalog? : " + utworzono);

		nowyKatalog.deleteOnExit();

	}

	private static void zadanie() {
		System.out.println("Prosz� poda� �cie�k�: ");
		Scanner sc = new Scanner(System.in);
		String sciezka = sc.nextLine();

		if (!new File(sciezka).exists()) {
				System.out
						.println("Podana �cie�ka: " + sciezka + " nie istnieje.\n" + "Prosz� poda� poprawn� �cie�k�.");
				sciezka = sc.nextLine();
			} else {
				File nowyKatalog = new File(sciezka);
				File plik = nowyKatalog.isDirectory() ? utw�rzPlik(nowyKatalog) : null; 
			}
		
		}

	private static File utw�rzPlik(File katalog) {
		File plik = new File(katalog + "test.txt");
		if(plik.exists()) {
			System.out.println("plik: " + plik + " zosta� utworzony. ");
		}
		System.out.println("Pliki w podanej lokalizacji to:\n" + katalog.list());
		return plik;
	}

}
