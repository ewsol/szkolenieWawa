package it.jsystems.szkolenie;

public class Multiply implements Operations, Auditable {

	@Override
	public int perform(int first, int second) {
		return Math.multiplyExact(first, second);
	}

	@Override
	public void log(int first, int second) {
		System.out.println("first: " + first );
		System.out.println("second: " + second );

	}
	
}
