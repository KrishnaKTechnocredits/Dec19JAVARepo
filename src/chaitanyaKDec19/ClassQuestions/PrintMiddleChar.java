package chaitanyaKDec19.ClassQuestions;

/*
 * Accept multiple strings from user and print middle character of the longest string
 */

public class PrintMiddleChar {

	public static void main(String[] args) {

		displayMiddleChar(args, args.length);

	}

	static void displayMiddleChar(String[] args, int argsLength) {

		String longestString = "";
		int maxLength = 0;

		for (int i = 0; i < argsLength; i++) {

			if (args[i].length() > maxLength) {

				maxLength = args[i].length();
				longestString = args[i];

			}

		}

		System.out.println("The longest string given in an array of string is: " + longestString);
		System.out.println("Middle character of the longest string in given array is: "
				+ longestString.charAt(longestString.length() / 2));
	}

}
