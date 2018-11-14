package it.jsystems.defaults;

public interface MyInterface2 {

	default void sayHello(String imie) {
		System.out.println("czeœæ" + imie + "1");
	}
	
	void myMethod();
}
