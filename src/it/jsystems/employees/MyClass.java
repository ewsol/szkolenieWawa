package it.jsystems.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {

	public static void main(String[] args) {
		Boss chief = new Boss("Ewa", 32, 20000, 3000);
		Employee junior = new Employee("Junior", 21,  15000, 1000);
		Employee regular = new Employee("Marek", 29, 18000, 1500);

		List<Employee> pracownicy = new ArrayList<>();
		pracownicy.addAll(Arrays.asList(chief, junior, regular));

		sumuj£¹cznezarobki(pracownicy);
		
		policzSredniWiek(pracownicy);
		System.out.println(chief.toString());
		System.out.println(junior.toString());
	}
	

	private static void policzSredniWiek(List<Employee> pracownicy) {
		double averageAge = pracownicy.stream()
		.collect(Collectors.summarizingInt(Employee::getAge))
		.getAverage();
		System.out.println("average age is : " + averageAge);
	}

	private static void sumuj£¹cznezarobki(List<Employee> pracownicy) {
		long sumaZarobków = pracownicy.stream()
				.collect(Collectors.summarizingInt(Employee::getSalary))
				.getSum();
		System.out.println("suma zarobków to: " + sumaZarobków);
		long sumaPremii = pracownicy.stream()
				.collect(Collectors.summarizingInt(Employee::getBonus))
				.getSum();
		System.out.println("suma premii to: " + sumaPremii);

	}
}
