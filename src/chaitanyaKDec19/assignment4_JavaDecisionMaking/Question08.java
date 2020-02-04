package chaitanyaKDec19.assignment4_JavaDecisionMaking;

import java.util.Scanner;

/*
 * Write a Java program that keeps a number from the user
 * and generates an integer between 1 and 7 and displays the name of the weekday. (use switchcase)
 */

public class Question08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting number from user
		System.out.print("Please enter a number between 1 to 7: ");
		int num = scanner.nextInt();

		scanner.close();

		// Calling method to display day of the week as per given input
		new Question08().displayDayOfTheWeek(num);

	}

	void displayDayOfTheWeek(int inputNum) {

		// Displaying appropriate information as per user input
		switch (inputNum) {

		case 1:
			System.out.println("The day of the week is Monday");
			break;

		case 2:
			System.out.println("The day of the week is Tuesday");
			break;

		case 3:
			System.out.println("The day of the week is Wednesday");
			break;

		case 4:
			System.out.println("The day of the week is Thursday");
			break;

		case 5:
			System.out.println("The day of the week is Friday");
			break;

		case 6:
			System.out.println("The day of the week is Saturday");
			break;

		case 7:
			System.out.println("The day of the week is Sunday");
			break;

		default:
			System.out.println("There is no day of the week available yet for the input number");
			break;

		}
	}

}
