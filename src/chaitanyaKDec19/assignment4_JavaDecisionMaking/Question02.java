package chaitanyaKDec19.assignment4_JavaDecisionMaking;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Find the largest of three numbers using Logical And operator
 */

public class Question02 {

	// Method to find max of three numbers
	private int findMax(int inputNumOne, int inputNumTwo, int inputNumThree) {

		if (inputNumOne > inputNumTwo && inputNumOne > inputNumThree)
			return inputNumOne;
		else if (inputNumTwo > inputNumOne && inputNumTwo > inputNumThree)
			return inputNumTwo;
		else
			return inputNumThree;
	}

	public static void main(String[] args) {

		int numOne = 0, numTwo = 0, numThree = 0;
		boolean isNumber = false;

		Scanner scanner = new Scanner(System.in);

		// Accepting 3 numbers from user and storing them in a variables
		while (!isNumber) {

			try {

				System.out.print("Please enter a number: ");
				numOne = scanner.nextInt();

				System.out.print("Please enter second number: ");
				numTwo = scanner.nextInt();

				System.out.print("Please enter third number: ");
				numThree = scanner.nextInt();

				isNumber = true;

			} catch (InputMismatchException me) {

				System.out.println("Please enter a valid input i.e. integer");
				scanner.next();
				continue;

			}

		}

		scanner.close();

		// Calling method to find max of three numbers
		System.out.println("Maxium number from given input is: " + new Question02().findMax(numOne, numTwo, numThree));

	}

}
