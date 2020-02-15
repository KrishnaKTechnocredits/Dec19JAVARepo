package pravinSDec19.TestPrograms;

/*
	5) WAP to Remove all non-alphabetical characters of a String in Java
	Input: Hello, How are you?
	Output: Hello How are you
 * 
 * 
 */

public class Q5removeNonAlphabetical {

	static String removeNonAlphaBet(String str) {

		String onlyStr = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			if (Character.isAlphabetic(ch) || Character.isWhitespace(ch)) {

				onlyStr = onlyStr + ch;
			}

		}

		return onlyStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello, How are you?";

		String onlyStr = removeNonAlphaBet(str);
		System.out.println(onlyStr);

	}

}
