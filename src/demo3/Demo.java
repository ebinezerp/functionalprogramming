package demo3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		/*
		 * for given integer value , need find square public int getSqure(int value){ }
		 * 
		 * for given integer value , find cube public int getCube(int value){ }
		 * 
		 * 
		 * for given integer value , squareroot in integer public int getSqureRoot(int
		 * value){
		 * 
		 * }
		 * 
		 */

		/*
		 * OneParamterAndReturnType<Integer> square = num -> num * num;
		 * OneParamterAndReturnType<Integer> cube = num -> num * num * num;
		 * OneParamterAndReturnType<Double> squareroot = num -> Math.sqrt(num);
		 */

		IntFunction<Integer> square = num -> num * num;
		IntFunction<Integer> cube = num -> num * num * num;
		IntFunction<Double> squareroot = num -> Math.sqrt(num);

		// one input and return boolean
		Predicate<Integer> isEven = (num) -> num % 2 == 0;

		Consumer<Integer> numPrinting = (num) -> System.out.println(num);

		BiConsumer<String, String> concatDisplay = (str1, str2) -> System.out.println(str1.concat(str2));

		BiPredicate<Double, Double> equalsFun = (str1, str2) -> str1.equals(str2);

		/*
		 * create sub string from given with first 3 characters// apple -> app public
		 * String firstSubstring(String str){}
		 * 
		 * create substring from given with last 3 characcters// applie -> lie public
		 * String lastSubstring(String str){}
		 * 
		 * 
		 */

		OneParamterAndReturnType<String> firstSubstring = (str) -> str.substring(0, 4);
		OneParamterAndReturnType<String> lastSubstring = (str) -> str.substring(str.length() - 4, str.length());

		List<Integer> nums = Arrays.asList(5, 6, 3, 8, 12, 15, 26, 29);

		// peridate -> one input and return boolean
		Stream<Integer> evenNumsStream = nums.stream().filter(isEven);
		evenNumsStream.forEach(num -> System.out.println(num));

	}

}
