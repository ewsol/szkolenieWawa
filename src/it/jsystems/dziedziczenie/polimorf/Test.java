package it.jsystems.dziedziczenie.polimorf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		Produkt rower = new Produkt("Rower", 100);
		Produkt czapka = new Odziez("Spódnica", 90, "S");
		Produkt kosmetyk = new Kosmetyk("Dior", 400, "perfumy", false);
		Produkt krem = new Krem("Vichy", 179, true, 20);

		List<Produkt> koszyk = Arrays.asList(rower, czapka, kosmetyk, krem);
		wyœwietlProduktyZKoszyka(koszyk);

		zliczSumêProduktów(koszyk);
		zapiszProduktydoPliku(koszyk);

		odczytajPlik();

		skopiujPlik();
	}

	private static void skopiujPlik() {
		File toRead = new File("C:/Users/student/produkty");
		File toWrite = new File("C:/Users/student/kopiaprodukty");

		try (FileInputStream fis = new FileInputStream(toRead); FileOutputStream fos = new FileOutputStream(toWrite);) {
			toWrite.createNewFile();
			byte[] data = new byte[fis.available()];
			fis.read(data);
			fos.write(data);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void odczytajPlik() {
		File produkty = new File("C:/Users/student/produkty");

		try {
			BufferedReader reader = new BufferedReader(new FileReader(produkty));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void zliczSumêProduktów(List<Produkt> koszyk) {
		int sum = koszyk.stream().map(Produkt::getCena).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);

	}

	private static void wyœwietlProduktyZKoszyka(List<Produkt> koszyk) {
		for (Produkt prod : koszyk) {
			System.out.println(prod.toString());
		}
	}

	private static void zapiszProduktydoPliku(List<Produkt> koszyk) {
		if (!koszyk.isEmpty()) {
			try {
				File produkty = createFile();
				PrintWriter out = new PrintWriter(new FileWriter(produkty));
				for (Produkt produkt : koszyk) {
					out.println(produkt.toString().toCharArray());
				}
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static File createFile() throws IOException {
		File produkty = new File("C:/Users/student/produkty");
		Files.deleteIfExists(produkty.toPath());
		produkty.createNewFile();
		return produkty;
	}
}
