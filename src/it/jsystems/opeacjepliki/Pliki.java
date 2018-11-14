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
		System.out.println("Proszê podaæ œcie¿kê: ");
		Scanner sc = new Scanner(System.in);
		String sciezka = sc.nextLine();

		if (!new File(sciezka).exists()) {
				System.out
						.println("Podana œcie¿ka: " + sciezka + " nie istnieje.\n" + "Proszê podaæ poprawn¹ œcie¿kê.");
				sciezka = sc.nextLine();
			} else {
				File nowyKatalog = new File(sciezka);
				File plik = nowyKatalog.isDirectory() ? utwórzPlik(nowyKatalog) : null; 
			}
		
		}

	private static File utwórzPlik(File katalog) {
		File plik = new File(katalog + "test.txt");
		if(plik.exists()) {
			System.out.println("plik: " + plik + " zosta³ utworzony. ");
		}
		System.out.println("Pliki w podanej lokalizacji to:\n" + katalog.list());
		return plik;
	}

}
