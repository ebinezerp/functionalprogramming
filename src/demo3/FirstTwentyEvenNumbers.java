package demo3;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FirstTwentyEvenNumbers {

	public static void main(String[] args) {

		IntPredicate isEven = (num) -> num % 2 == 0;

		/*
		 * 1.first way
		 * 
		 */

		/*
		 * IntStream.iterate(1, count -> count + 1)
		 * .limit(40).filter(isEven).forEach(System.out::println);
		 */

		// IntStream.iterate(1, num -> num +
		// 1).filter(isEven).limit(20).forEach(System.out::println);

		/*
		 * 1. print numbers from 1 to 10
		 * 
		 * for(int i =1; i<=10; i++){}
		 * 
		 * int count =1; int num = 1; while(count<=10){
		 * 
		 * if(num%2==0){ count++; } num++; }
		 * 
		 * 
		 */

		IntStream.iterate(1, i -> i + 1).filter(num -> num % 2 == 0).limit(10).forEach(System.out::println);

	}

}
