package it.jsystems.wzorce;

public class Singleton {

	private static volatile Singleton instance = null;
	
	private Singleton() {
		
	}
	public static void main(String[] args) {
	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();
	
	System.out.println("Czy to to samo? " + (s1==s2));
	}
	
	static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) { //synchonizacja, ¿eby siê upewnic czy instancja nie powsta³a w¹tek
				if (instance == null) {
					instance = new Singleton();
				}

			}
		}
		return instance;
	}
}
