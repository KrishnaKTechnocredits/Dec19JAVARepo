package rohiniBDec19.RohiniAssignment3;

import java.util.Scanner;

/*12) WAP to find word is palindrome or not 
 a. String name = “naman” i. Naman is palindrome
 b. String name = “harsh” i. Harsh is not palindrome */

public class Program12 {
	static String reverse = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String originalStr = sc.nextLine();
		String reverseString = findreverse(originalStr);
		if (reverseString.equals(originalStr))
			System.out.println("String is palindrom");
		else
			System.out.println("String is not  palindrom");
	}

	static String findreverse(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;

	}

}
