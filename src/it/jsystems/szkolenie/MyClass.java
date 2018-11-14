package it.jsystems.szkolenie;

import it.jsystems.defaults.MyInterface2;

public class MyClass implements MyInterface, MyInterface2 {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.doSomething();
		System.out.println(MyInterface.myConstant);
		MyInterface.doNothing();
	}
	
	@Override
	public void doSomething() {
		System.out.println("Implementacja metody");
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub	
	}

}
