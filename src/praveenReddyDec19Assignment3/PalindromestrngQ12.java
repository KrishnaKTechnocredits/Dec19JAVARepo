package praveenReddyDec19Assignment3;
/*
 WAP to find word is palindrome or not ? 
 a. String name = “naman” i. Naman is palindrome 
 b. String name = “harsh” i. Harsh is not palindrome
 */

public class PalindromestrngQ12 {
	static void PalindromeOfString(String S1, String S2) {
		// String S11 = "praveen";
		String S12 = "";
		String S21 = "";
		// char[] abc =S11.toCharArray();
		for (int i = S1.length() - 1; i >= 0; i--) {
			S12 = S12 + S1.charAt(i);
		}
		for (int i = S2.length() - 1; i >= 0; i--) {
			S21 = S21 + S2.charAt(i);
		}
		if (S1.equals(S12))
			System.out.println("Given String " + S1 + " is Palindrome");
		else
			System.out.println("Given String " + S1 + " is not Palindrome");
		if (S2.equals(S21))
			System.out.println("Given String " + S2 + " is Palindrome");
		else
			System.out.println("Given String " + S2 + " is not Palindrome");
	}

	public static void main(String[] args) {
		String S1 = "naman";
		String S2 = "harsh";
		PalindromestrngQ12.PalindromeOfString(S1, S2);
	}
}
