package it.jsystems.kolekcje;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sety {

	/*
	 * Tylko unikalne warto�ci - najszybciej z listy wybra� unkalne
	 * elementy zmieniaj�c ja na set
	 * 
	 */
	
public static void main(String[] args) {
	
	List<String> imiona = Arrays.asList("Ewa", "Ala", "Jola", "Ewa", "Zosia", "Zosia");
	System.out.println(imiona);
	
	Set<String> wynikowy = new HashSet<>(imiona);
	System.out.println(wynikowy);
}
}