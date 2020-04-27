package demo3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DisplayArrayListElements {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Venkat");
		names.add("Akhil");
		names.add("Chaitanya");
		names.add("sai vardhani");
		names.add("Hemalalitha");
		names.add("Jhanavi");
		names.add("Anil");
		names.add("Deepthi");
		names.add("Harish");
		names.add("Pardhu");

		/*
		 * for (int i = 0; i < names.size(); i++) { System.out.println(names.get(i)); }
		 */

		/*
		 * Iterator<String> it = names.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		/*
		 * for (String name : names) { System.out.println(name); }
		 */

		names.forEach(name -> System.out.println(name));

		/*
		 * int count = 0;
		 * 
		 * for (String name : names) { if (name.contains("e")) { count++; } }
		 * 
		 * System.out.println(count);
		 */

		/* long count = names.stream().filter(name -> name.contains("e")).count(); */

		Stream<String> stream = names.stream();
		Stream<String> stringWithE = stream.filter(name -> name.contains("e"));
		long count = stringWithE.count();

		System.out.println(count);

	}

}
