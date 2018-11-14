package it.jsystems.defaults;

public class MyClass implements MyInterface, MyInterface2 {

	@Override
	public void sayHello(String imie) {
		// TODO Auto-generated method stub
		MyInterface.super.sayHello(imie);
	}

	@Override
	public void myMethod() {
		System.out.println("do nothing");
	}
	

}
