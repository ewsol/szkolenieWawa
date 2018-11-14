package it.jsystems.szkolenie;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String operationType = scanner.nextLine();
		
		Operations operationToPerform = new Multiply();

		if ("S".equalsIgnoreCase(operationType)) {
			operationToPerform = new Sum();
		}

		int first = 8;
		int second = 2;

		int operationResult = operationToPerform.perform(first, second);
		System.out.println("result of operation is: " + operationResult);
	}
}
