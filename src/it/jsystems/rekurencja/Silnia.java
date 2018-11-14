package it.jsystems.rekurencja;

import java.util.Scanner;

public class Silnia {

	private static int silnia(int i) {
		if (i < 1)
			return 1;
		else
			return i * silnia(i - 1);
	}

	public static void main(String[] args) {
		System.out.println("Podaj dla jakiej liczby obliczyc silnie.\n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n + "! = " + silnia(n));
		sc.close();
	}
}
