package chaitanyaKDec19.ClassQuestions;

/*
 * Accept multiple strings from user and print it in reverse order
 */

public class StringReverse {

	public static void main(String[] args) {

		String[] reversedString = new StringReverse().returnReverseString(args);

		System.out.println("Reversed strings are: ");

		for (int i = 0; i < reversedString.length; i++) {
			System.out.println(reversedString[i]);
		}

	}

	String[] returnReverseString(String[] args) {

		String[] reversedStringArray = new String[args.length];
		String reversedString = "";
		String string;

		for (int i = 0; i < args.length; i++) {

			string = args[i];
			reversedString = "";

			for (int k = string.length() - 1; k >= 0; k--) {
				reversedString = reversedString + string.charAt(k);
			}

			reversedStringArray[i] = reversedString;
		}

		return reversedStringArray;
	}

}
