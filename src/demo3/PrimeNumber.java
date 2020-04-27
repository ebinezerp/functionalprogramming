package demo3;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 35;
		/*
		 * boolean isPrime = true;
		 * 
		 * for (int i = 2; i < 35; i++) { if (num % i == 0) { isPrime = false; } }
		 * 
		 * System.out.println(isPrime);
		 */

		boolean result = IntStream.range(2, 35).anyMatch(i -> num % i == 0);

		if (result) {
			System.out.println("Not a prime");
		} else {
			System.out.println("Prime Number");
		}
	}

}
