package demo3;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class NumbersFromOneToHundredWithDifferenceThreee {

	public static void main(String[] args) {

		IntPredicate isMultipleOfThree = (num) -> num % 3 == 0;

		IntStream.rangeClosed(1, 100).filter(isMultipleOfThree).forEach(System.out::println);

	}

}
