package it.jsystems.employees;

public class Boss extends Employee {
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getName());
		builder.append(" earns ");
		builder.append(getSalary());
		return builder.toString();
	}

	private int factor = 2;

	
	public Boss(String name, int age, int salary, int bonus) {
		super(name, age, salary, bonus);
	}



	@Override
	public int getSalary() {
		return super.getSalary() * factor;
	}

}
