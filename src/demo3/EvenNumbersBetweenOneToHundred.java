package demo3;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenNumbersBetweenOneToHundred {

	public static void main(String[] args) {

		IntPredicate isEven = (num) -> num % 2 == 0;

		
		//forEach(Consumer) -> input -> which operation ->implementation
		IntStream.rangeClosed(1, 100).filter(isEven).forEach(System.out::println);

		/*
		 * for (int i = 1; i <= 100; i++) { if (isEven(i)) { System.out.println(i); } }
		 */

	}

	/*
	 * private static boolean isEven(int num) { return num % 2 == 0; }
	 */

}
