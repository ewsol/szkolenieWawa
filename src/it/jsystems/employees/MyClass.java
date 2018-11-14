package it.jsystems.employees;

public class MyClass {

	public static void main(String[] args) {
		Boss chief = new Boss("Ewa", 20000, 3000);
		Employee junior = new Employee("Junior", 15000, 1000);
		System.out.println(chief.toString());
		System.out.println(junior.toString());

	}
}
