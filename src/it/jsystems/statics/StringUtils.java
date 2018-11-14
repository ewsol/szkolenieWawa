package it.jsystems.statics;

public final class StringUtils {

	private static final String EMPTY = "";

	private StringUtils() {

	}

	public static boolean isEmptyOrNull(String s) {
		return (s == null || EMPTY.equals(s));
	}

	public static String capitalize(String s) {
		if (s != null) {
			s.toUpperCase();
		}
		return s;
	}

	public static String trimToSize(String s, int lenght) {
		if (s != null) {
			if (s.length() > lenght) {
				return s.substring(0, lenght - 1);
			} else {
				throw new IllegalArgumentException("String is shorter than expected lenght to trim");
			}
		}
		return s;

	}

}
