package it.jsystems.dziedziczenie;

public class Bicycle extends Product {

	int numberOfWheels;
	public Bicycle(String name, double price) {
		super(name, price);
		this.numberOfWheels = 2;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

}
