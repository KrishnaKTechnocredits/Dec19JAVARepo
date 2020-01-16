package chaitanyaKDec19.AssignmentThree;

/*
 * WAP to reveres user given number
 */

import java.util.Scanner;

public class Question05Client {

	public static void main(String[] args) {

		System.out.println("Please enter a number to print in reverse order:");

		// Accepting a number from user and storing it in a variable
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		// Calling method to return reversed form of user input number and displaying it
		System.out.println("User given number is: " + number + " & its reverse form is: "
				+ new Question05().displayNumInReverse(number));

	}

}
