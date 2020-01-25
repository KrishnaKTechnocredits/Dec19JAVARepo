/*
 * 11) WAP to find to number is palindrome or not. Note:- Palindrome means given word/number is same to read from forward and backward i.e. actual number :- 12321 reverse  of actual number :- 12321 
 */

package krantikhair.assignment3;

import java.util.Scanner;

public class Question11 {
	int Display(int number) {
		int reverse;
		int reminder;
		for (reverse = 0; number > 0; number = number / 10) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;

		}
		return reverse;

	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		Question11 a = new Question11();
		int Pal = a.Display(number);
		if (Pal == number) {
			System.out.println(number + " is a palindrome");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}

}
