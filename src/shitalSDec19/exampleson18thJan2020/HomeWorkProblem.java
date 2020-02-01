/* print: (i). Capital Letters
 * (ii). Digits
 * (iii). Odd Num Sum
 * (iv). Special Characters
 * (v). Even No sum
 * (vi). lower case characters
 * Output: ABF4.[][$%&2h*/

package shitalSDec19.exampleson18thJan2020;

public class HomeWorkProblem {

	static String upperCase="";
	static int number = 0;
	static String digit = "";
	static int oddSum = 0;
	static String specialChar = "";
	static int evenSum = 0;
	static String lowerCase="";
	static int evenNumber=0;

	static void printUpperCaseLetters(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			// boolean b = Character.isUpperCase(ch);
			boolean b = Character.isUpperCase(s.charAt(i));
			if (b == true)
				upperCase = upperCase + ch;
		}
	}

	/*static void printDigits(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean isDigit = Character.isDigit(s.charAt(i));
			if (isDigit == true)
				digit = digit + s.charAt(i);
		}
	}*/

	static void printOddNoSum(String s) {
		for (int i = 0; i < s.length(); i++) {
			boolean isDigit = Character.isDigit(s.charAt(i));
			if (isDigit == true) 
			{
				String n = String.valueOf(s.charAt(i));
				number = Integer.parseInt(n);
				if (number % 2 == 1)
					oddSum = oddSum + number;
			}
		}
	}

	static void printEvenNoSum(String s) {
		for (int i = 0; i < s.length(); i++) {
			boolean isDigit = Character.isDigit(s.charAt(i));
			if (isDigit == true) {
				String s1 = String.valueOf(s.charAt(i));
				evenNumber= Integer.parseInt(s1);
				if (evenNumber % 2 == 0)
					evenSum = evenSum + evenNumber;
			}
		}
	}
	static void printSpecialCharacters(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			boolean isLetter = Character.isLetter(ch);
			boolean isDigit = Character.isDigit(ch);
			if (isLetter == false && isDigit == false)
				specialChar = specialChar + ch;
		}
	}

	static void printLowerCaseLetters(String s) {
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			boolean isLowerCase = Character.isLowerCase(s.charAt(i));
			if (isLowerCase == true)
				lowerCase = lowerCase + ch;
		}
	}

	public static void main(String[] args) {
		String s = "213hs.[][$%&ABF";
		printUpperCaseLetters(s);
		//printDigits(s);
		printOddNoSum(s);
		printSpecialCharacters(s);
		printEvenNoSum(s);
		printLowerCaseLetters(s);
		System.out.println("output is " + upperCase + oddSum + specialChar + evenSum + lowerCase);
	}
}
