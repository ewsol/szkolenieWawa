package it.jsystems.defaults;

public interface MyInterface {
	
	default void sayHello(String imie) {
		System.out.println("cze��" + imie + "2");

	}
}
