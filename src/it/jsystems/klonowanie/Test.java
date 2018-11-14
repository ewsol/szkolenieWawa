package it.jsystems.klonowanie;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Punkt p1 = new Punkt(10, 10);
		Punkt p2 = (Punkt) p1.clone();
		Punkt p3 = new Punkt(10, 10);
		Punkt p4 = p3;

		boolean porównanie1 = p1 == p2;
		boolean porównanie2 = p1.equals(p2);

		boolean porównanie3 = p3 == p4;
		boolean porównanie4 = p3.equals(p4);

		System.out.println("Porównanie 1: " + porównanie1);
		System.out.println("Porównanie 2: " + porównanie2);

		System.out.println("Porównanie 3: " + porównanie3);
		System.out.println("Porównanie 4: " + porównanie4);

		wyœwietl(p1, p2, p3);
		p2.setX(11);
		p3.setX(12);
		wyœwietl(p1, p2, p3);

		Odcinek o1 = new Odcinek(p1, p2);
		Odcinek o2 = (Odcinek) o1.clone();
		Odcinek o3 = o1;

		boolean porównanieO1 = o1 == o2;
		System.out.println(porównanieO1);
		boolean porównanieO2 = o1 == o3;
		System.out.println(porównanieO2);
		wyœwietl(o1, o2, o3);
	}

	private static <T> void wyœwietl(@SuppressWarnings("unchecked") T... points) {
		for (T t: points) {
			System.out.println(t.toString());
		}
	}

}
