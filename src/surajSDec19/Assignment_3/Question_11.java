package surajSDec19.Assignment_3;

import java.util.Scanner;

/*WAP to find to number is palindrome or not.
 * 
 * Author: Suraj Shinde
 */
public class Question_11 {
	int reverseNumber = 0;

	public void palindromeMethod(int number, int reverseNumber) {

		if (reverseNumber == number) {
			System.out.println(number + " Is palindrome number");
		} else {
			System.out.println(number + " is not palindrome number");
		}
	}

	public int reverseNumber(int number) {
		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		return reverseNumber;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		Question_11 question_11 = new Question_11();
		int reverseNumber = question_11.reverseNumber(number);
		question_11.palindromeMethod(number, reverseNumber);

	}

}
