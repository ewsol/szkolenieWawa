package it.jsystems.dziedziczenie.inter;

public class SuperHuman implements WorkingStudent{
	
	private int age;
	private String name;

	public static void main(String[] args) {
		SuperHuman sHuman = new SuperHuman(22, "Zygi");
		System.out.println(sHuman.name.toString() + " is a super human because he's only "
				+ sHuman.age 
				+ " and he is working as "
				+ sHuman.getProfession()
				+ " about "
				+ sHuman.getWorkingHoursPerWeek() + "hours per week");
	}
	
	public SuperHuman(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String getSubject() {
		return "informatic";
	}

	@Override
	public String getProfession() {
		return "java developer";
	}

	@Override
	public int getWorkingHoursPerWeek() {
		return 25;
	}

}
