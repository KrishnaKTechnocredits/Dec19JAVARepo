package chaitanyaKDec19.HomeWork18Jan2020;

/*
 * Write a program to accept string from user and display:
 * 1. Capital Letters
 * 2. Digit - Odd number sum
 * 3. Special Characters
 * 4. Even Number sum
 * 5. Small Characters
 */

public class HomeWork {

	static void displayString(String string) {

		// declaring variable required to store values
		String capitalLetters = "";
		String specialChar = "";
		String smallLetters = "";
		int oddSum = 0;
		int evenSum = 0;

		// using for loop to extract desired values and storing them in respective
		// variables
		for (int i = 0; i < string.length(); i++) {

			String ch = "";

			if (Character.isUpperCase(string.charAt(i))) {

				capitalLetters = capitalLetters + string.charAt(i);

			} else if (Character.isLowerCase(string.charAt(i))) {

				smallLetters = smallLetters + string.charAt(i);

			} else if (Character.isDigit(string.charAt(i))) {

				ch = ch + string.charAt(i);

				if (Integer.parseInt(ch) % 2 == 0)
					evenSum = evenSum + Integer.parseInt(ch);
				else
					oddSum = oddSum + Integer.parseInt(ch);

			} else {

				specialChar = specialChar + string.charAt(i);
			}

		}

		// displaying the end result
		System.out.println("The output is: " + capitalLetters + oddSum + specialChar + evenSum + smallLetters);

	}

	public static void main(String[] args) {

		// declaring string
		String string = "213hs.[][$%&ABF";

		// calling method to get the expected output
		displayString(string);

	}

}
