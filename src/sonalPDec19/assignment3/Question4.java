package sonalPDec19.assignment3;
/*
 * WAP to find sum of user given number.
	a. Input:- 159753
	b. Sum of given number:- 30
 */

import java.util.Scanner;

public class Question4 {

	static void doSumOfGivenNumber() {
		/*
		 * This method will ask for number as user input and will print sum of given
		 * number.
		 */
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:- ");
		String userNum = s.nextLine();

		for (int i = 0; i < userNum.length(); i++) {
			sum = sum + Integer.parseInt(String.valueOf(userNum.charAt(i)));
		}

		System.out.println("Sum of given number:- "+sum);
	}

	public static void main(String[] args) {
		doSumOfGivenNumber();

	}
}