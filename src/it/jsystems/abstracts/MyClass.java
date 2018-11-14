package it.jsystems.abstracts;

public class MyClass{
	
	public static void main(String[] args) {
		
		Human person = new Human("Ewa", 32, true, "white");
		
		System.out.println("Name of created animail is: " + person.getName());
		System.out.println("Age: " + person.getAge());		
		System.out.println("Her race is: " + person.getRace());
		if(person.isPredator) {
			System.out.println("and she is a predator.");
		}
				
		GoldFish fish = new GoldFish("goldie", 1, true, "oranda");
		
		fish.p³ywaj();
		
		System.out.println("Her breed is: " + fish.getBreed());
		if(fish.slodkowodna) {
			System.out.println("and she is a fresh-water.");
		}

	}
	
}
