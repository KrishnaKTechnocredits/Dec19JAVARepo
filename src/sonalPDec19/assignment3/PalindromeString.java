package assignment3;
/*
 * WAP to find word is palindrome or not?
 */
import java.util.Scanner;

public class PalindromeString {

	void findPalindromeString(String inputString) {
		String revString = "";
		for (int i = inputString.length()-1; i >= 0; i--) {
			revString = revString + inputString.charAt(i);
		}

		System.out.println("Reverse string: " + revString);

		if (inputString.compareTo(revString) == 0)
			System.out.println("String is Palindrome.");
		else
			System.out.println("String is not Palindrome.");
	}

	public static void main(String[] args) {
		PalindromeString palindromestring = new PalindromeString();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string: ");
		String inputString = s.nextLine();
		palindromestring.findPalindromeString(inputString);

	}

}
