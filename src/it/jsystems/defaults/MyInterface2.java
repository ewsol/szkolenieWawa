package it.jsystems.defaults;

public interface MyInterface2 {

	default void sayHello(String imie) {
		System.out.println("cze��" + imie + "1");
	}
	
	void myMethod();
}
