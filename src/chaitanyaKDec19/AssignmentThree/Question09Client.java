package chaitanyaKDec19.AssignmentThree;

import java.util.Scanner;

/*
 * WAP to find average of user given array
 */

public class Question09Client {

	public static void main(String[] args) {

		int size = 0;
		System.out.println("Please specify for how many numbers you would like to find average: ");

		// accepting array size from user and storing it in a variable & declaring array
		// based on it
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int[] numberArray = new int[size];

		// accepting values from user
		for (int i = 0; i < numberArray.length; i++) {

			System.out.println("Please enter a number");
			numberArray[i] = scanner.nextInt();

		}

		// calling method to display average of numbers from given array
		new Question09().displayAverage(numberArray);

	}

}
