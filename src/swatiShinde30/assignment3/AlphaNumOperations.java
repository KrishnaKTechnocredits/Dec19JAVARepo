package swatiShinde30.assignment3;

import java.util.Scanner;

/*String s = "213hs.[][$%&ABF";
		//1. Capitals letters
		//2. Digit
			//.a Odd Number sum
		//3. Special characters
		//4. Even Number sum 
		//5. Small characters
		//Output
		//ABF2134.[][$%&2hs*/
public class AlphaNumOperations {

	static void alphaNumCheck(String str) {
		int oddSum = 0;
		int evenSum = 0;
		String upperCase = "";
		String lowerCase = "";
		String digits = "";
		String specialChars = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				digits = digits + ch;
				if (ch % 2 != 0) {
					oddSum = oddSum + Integer.parseInt(str.valueOf(ch));
				} else {
					evenSum = evenSum + Integer.parseInt(str.valueOf(ch));
				}
			} else if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {// Upper case logic
					upperCase = upperCase + ch;

				} else {
					lowerCase = lowerCase + ch;
				}
			} else {
				specialChars = specialChars + ch;
			}
		}
		System.out.println("Output " + upperCase + digits + oddSum + specialChars + evenSum + lowerCase);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.next();
		alphaNumCheck(str);
	}

}
