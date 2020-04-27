package intro;

public class Main {

	public static void main(String[] args) {

		ArithmaticFunctions addFun = (x, y) -> x + y;

		ArithmaticFunctions subFun = (x, y) -> x - y;

		/*
		 * System.out.println(addFun.performOperation(10, 20));
		 * System.out.println(subFun.performOperation(10, 20));
		 */

		Calculator calculator = new Calculator();

		calculator.calculate(addFun, 10, 20);
		calculator.calculate(subFun, 40, 20);
		calculator.calculate((a, b) -> a * b, 20, 10);

	}

}
