package it.jsystems.employees;

import java.util.Arrays;

public class Employee implements Comparable<Employee> {

	public static void main(String[] args) {
		Employee[] array = { new Employee("Aga", 20000, 2000), new Employee("Ewa", 7000, 1000),
				new Employee("Adam", 3000, 500), new Employee("Iza", 15000, 0) };
		Arrays.sort(array);
		System.out.println("by salary: " + Arrays.toString(array));

		Arrays.sort(array, new SortByNameComparator());
		System.out.println("by name: " + Arrays.toString(array));

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
	protected int salary;
	protected int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Employee(String name, int salary, int bonus) {
		super();
		this.name = name;
		this.bonus = bonus;
		this.salary = salary;
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

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(getSalary(), o.getSalary());

	}

}
