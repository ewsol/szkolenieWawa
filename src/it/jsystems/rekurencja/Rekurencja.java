package it.jsystems.rekurencja;

public class Rekurencja {

	public static int powerOf10(int n) {
		if (n == 0) {
			return 1;
		}
		return powerOf10(n - 1) * 10;
	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2); //ci¹g Fibonacciego
	}

	public static void main(String[] args) {
		int wynik = fib(5);//Rekurencja.powerOf10(2);
		System.out.println("Wynik to: " + wynik);
	}

}
