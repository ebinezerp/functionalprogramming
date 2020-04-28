package demo3;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		Integer[] nums = new Integer[] { 2, 5, 67, 8, 3, 2, 7, 4, 7, 20, 53, 82 };

		/*
		 * Arrays.sort(nums); for(int i:nums) { System.out.println(i); }
		 */

		// Arrays.stream(nums).sorted().forEach(System.out::println);

		/*
		 * compare(o1,o2){ }
		 * 
		 * 
		 */

		/*
		 * Arrays.sort(nums, (n1, n2) -> -n1.compareTo(n2));
		 * Arrays.stream(nums).forEach(System.out::println);
		 */

		/*
		 * Integer[] addedNums = new Integer[nums.length];
		 * 
		 * for(int i =0; i<nums.length; i++){ adddedNums[i] = nums[i]+10; }
		 * 
		 * 
		 * for(int num: addedNums){ system.out.println(num) }
		 * 
		 */

		/*
		 * Arrays.stream(nums).map(num -> num = num + 10).forEach(System.out::println);
		 * 
		 * System.out.println();
		 * 
		 * Arrays.stream(nums).forEach(System.out::println);
		 */

		String[] names = new String[] { "ebinezer", "sudhakar", "sagar", "jayasheela", "sajeev", "shyam", "kumar",
				"Ashok" };

		/*
		 * Integer[] strLengths = new Integer[names.length]; for(int i =0; i<=
		 * names.length; i++){ strLengths[i] = names[i].length(); }
		 * 
		 * 
		 */

		Arrays.stream(names).mapToInt(String::length).forEach(System.out::println);

		/*
		 * 
		 * for(String name: names){
		 * 
		 * int <-name.length();
		 * 
		 * }
		 * 
		 * map -> type (input) -> type(output)
		 * 
		 * mapToInt -> type (input) -> int(output)
		 * 
		 * 
		 * 
		 */

	}

}
