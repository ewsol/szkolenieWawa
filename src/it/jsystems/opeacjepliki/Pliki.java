package it.jsystems.opeacjepliki;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pliki {

	public static void main(String[] args) {
		createAndFillFile();
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
	
	public static void createAndFillFile() {

		try {
			File f = new File("C:/Users/student/zadanie");
			f.createNewFile();

			FileWriter out = new FileWriter(f);
			out.write("Czeœæ to test zapisywania do pliku.".toCharArray());
			out.flush();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void zadanie() {
		System.out.println("Proszê podaæ œcie¿kê: ");
		Scanner sc = new Scanner(System.in);
		String sciezka = sc.nextLine();
		File katalog = new File(sciezka); // np. C:/Users/student
		sc.close();

		if (!katalog.exists() || !katalog.isDirectory()) {
			System.out.println("Podana œcie¿ka: " + sciezka + " nie istnieje lub nie jest katalogiem.\n");
		} else {
			utwórzPlikTestowy(katalog);

			wylistujPliki(katalog);
		}
	}

	private static void wylistujPliki(File katalog) {
		List<File> filesInDirectory = katalog.listFiles() != null ? Arrays.asList(katalog.listFiles())
				: Collections.emptyList();
		if (!filesInDirectory.isEmpty()) {
			for (final File fileEntry : katalog.listFiles()) {
				if (fileEntry.isDirectory()) {
					wylistujPliki(fileEntry);
				} else {
					System.out.println(fileEntry.getName());
				}
			}
		}
	}

	private static void utwórzPlikTestowy(File katalog) {
		File plik = new File(katalog.getPath() + "/test.txt");
		if (!plik.exists()) {
			try {
				plik.createNewFile();
				System.out.println("plik: " + plik + " zosta³ utworzony. ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		plik.deleteOnExit();
	}
}
