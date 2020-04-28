package demo3;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumbersBetweenOneToHundred {

	public static void main(String[] args) {

		IntPredicate isPrime = (num) -> {
			return !IntStream.range(2, num).anyMatch(i -> num % i == 0);
		};

		IntStream.rangeClosed(1, 100).filter(isPrime).forEach(System.out::println);

	}

}
