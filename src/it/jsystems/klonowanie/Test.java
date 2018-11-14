package it.jsystems.klonowanie;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Punkt p1 = new Punkt(10, 10);
		Punkt p2 = (Punkt) p1.clone();
		Punkt p3 = new Punkt(10, 10);
		Punkt p4 = p3;

		boolean por�wnanie1 = p1 == p2;
		boolean por�wnanie2 = p1.equals(p2);

		boolean por�wnanie3 = p3 == p4;
		boolean por�wnanie4 = p3.equals(p4);

		System.out.println("Por�wnanie 1: " + por�wnanie1);
		System.out.println("Por�wnanie 2: " + por�wnanie2);

		System.out.println("Por�wnanie 3: " + por�wnanie3);
		System.out.println("Por�wnanie 4: " + por�wnanie4);

		wy�wietl(p1, p2, p3);
		p2.setX(11);
		p3.setX(12);
		wy�wietl(p1, p2, p3);

		Odcinek o1 = new Odcinek(p1, p2);
		Odcinek o2 = (Odcinek) o1.clone();
		Odcinek o3 = o1;

		boolean por�wnanieO1 = o1 == o2;
		System.out.println(por�wnanieO1);
		boolean por�wnanieO2 = o1 == o3;
		System.out.println(por�wnanieO2);
		wy�wietl(o1, o2, o3);
	}

	private static <T> void wy�wietl(@SuppressWarnings("unchecked") T... points) {
		for (T t: points) {
			System.out.println(t.toString());
		}
	}

}
