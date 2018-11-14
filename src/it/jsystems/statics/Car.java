package it.jsystems.statics;

import java.util.Arrays;
import java.util.List;

public class Car {

	private String engine;
	private String name;
	
	public static int numberOfCars;

	public static final List<String> SILNIKI;

	
	static {
		SILNIKI = Arrays.asList("V8", "V16");
	}
	
	public Car(String engine, String name) {
		super();
		this.engine = engine;
		this.name = name;
		numberOfCars++;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public static void setNumberOfCars(int numberOfCars) {
		Car.numberOfCars = numberOfCars;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("V8", "Jaguar");
		Car c2 = new Car("V16", "Audi");
		System.out.println(Car.numberOfCars);
		String s = StringUtils.trimToSize(c1.getName(), 3);
		System.out.println(s);

	}
	
	public static boolean isEmpty(String s) {
		return "".equals(s);
	}
}
