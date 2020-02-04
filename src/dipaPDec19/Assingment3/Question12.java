package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 * WAP to find word is palindrome or not ?
	a. String name = “naman”
	i. Naman is palindrome
	b. String name = “harsh”
	i. Harsh is not palindrome
 */
public class Question12 {
	public static void main(String[] args) {
		Question12 que12 = new Question12();
		System.out.println("Enter the String");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		que12.checkPalindrome(str);
	}

	void checkPalindrome(String str1) {

		String reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) // reverse the string
		{
			reverse = reverse + str1.charAt(i);
		}
		if (str1.equals(reverse)) // compares with reverse string.
			System.out.println(str1 + " is palindrome.");
		else
			System.out.println(str1 + " is not a palindrome.");
	}
}
