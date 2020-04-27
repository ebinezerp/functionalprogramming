package functionalprogramming;

public class Demo {

	public static boolean isCharacterPresent(String str, char character) {

		/*
		 *   Imperative Style of coding -> total error prone
		 *   
		 *   we not only concenterate on what to do? but only
		 *   we concentrate on how do ?
		 * 
		 * char[] strCharacters = str.toCharArray();
		 * 
		 * for (int i = 0; i < strCharacters.length; i++) {
		 * if(character==strCharacters[i]) { return true; } }
		 * 
		 * return false;
		 */

		// declarative style of coding -> what to do ?
		return str.contains(String.valueOf(character));
	}

}
