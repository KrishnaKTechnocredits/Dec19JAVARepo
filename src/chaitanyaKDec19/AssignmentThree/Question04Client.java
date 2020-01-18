package chaitanyaKDec19.AssignmentThree;

/*
 * WAP to find sum of user given number.
 */

import java.util.Scanner;

public class Question04Client {

	public static void main(String[] args) {

		int number = 0;
		System.out.println("Please enter a number: ");

		// Accepting a number from user and storing it in a variable
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();

		// Calling method to return sum of each digit from given number and displaying
		// the sum
		System.out.println("User given number is: " + number + " and total of its digits is: "
				+ new Question04().sumOfDigits(number));
	}

}
