package swatiShinde30.assignment3;

import java.util.Scanner;

public class AlphaNumericAddition {

	static void alphaNumCheck(String str) {
		int number = 0;
		String alpha = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isDigit = Character.isDigit(ch);
			if (isDigit == true) {
				number = number + Integer.parseInt(str.valueOf(ch));
			} else if (isDigit == false) {
				alpha = alpha + ch;
			}
		}
		System.out.println("Addition of num is " + number);
		System.out.println("Characters are " + alpha);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		// System.out.println("Numbers in given string");
		alphaNumCheck(str);
	}

}
