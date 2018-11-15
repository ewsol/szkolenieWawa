package it.jsystems.employees;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

	public static void main(String[] args) {
		Employee[] array = { new Employee("Aga", 20, 20000, 2000), new Employee("Ewa", 32, 7000, 1000),
				new Employee("Adam", 56, 3000, 500), new Employee("Iza", 19, 15000, 0) };
		Arrays.sort(array);
		System.out.println("by salary: " + Arrays.toString(array));

		Arrays.sort(array, new SortByNameComparator());
		System.out.println("by name: " + Arrays.toString(array));

		Set<Employee> set = new TreeSet<>(new SortByNameComparator()); //stworzony comparator
		set.addAll(Arrays.asList(array));

		System.out.println("Sorted by name set: " + set);

		
		Set<Employee> setSalary = new TreeSet<>(); //default comparable
		setSalary.addAll(Arrays.asList(array));
		
		System.out.println("Sorted by salary set: " + setSalary);

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(" earns ");
		builder.append(this.salary + this.getBonus());
		return builder.toString();
	}

	String name;
	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected int salary;
	protected int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Employee(String name, int age, int salary, int bonus) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary + bonus;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int compareTo(Employee o, Employee o2) {
		if (o.getName().length() > o.getName().length()) {
			return 1;
		} else if (o.getName().length() < o.getName().length()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(getSalary(), o.getSalary());

	}
}
