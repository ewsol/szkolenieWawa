package it.jsystems.dziedziczenie.polimorf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		Produkt rower = new Produkt("Rower", 100);
		Produkt czapka = new Produkt("Czapka", 20);
		Produkt kosmetyk = new Kosmetyk("Dior", 400, "perfumy", false);

		List<Produkt> koszyk = Arrays.asList(rower, czapka, kosmetyk);
		wyœwietlProduktyZKoszyka(koszyk);
		
		zliczSumêProduktów(koszyk);
	}

	private static void zliczSumêProduktów(List<Produkt> koszyk) {
		int sum  = koszyk.stream()
		.map(Produkt::getCena)
		.collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
	}

	private static void wyœwietlProduktyZKoszyka(List<Produkt> koszyk) {
		for (Produkt prod : koszyk) {
			System.out.println(prod.toString());
		}
	}

}
