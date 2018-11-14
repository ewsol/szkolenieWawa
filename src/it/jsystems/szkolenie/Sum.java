package it.jsystems.szkolenie;

public class Sum implements Operations {

	@Override
	public int perform(int first, int second) {
		return Math.addExact(first, second);
	}

}
