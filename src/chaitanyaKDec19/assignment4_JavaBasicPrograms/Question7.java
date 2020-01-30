package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * Write a Java program to convert seconds to hour, minute andseconds
 */

public class Question7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting seconds from user
		System.out.print("Please enter seconds: ");
		int seconds = scanner.nextInt();

		scanner.close();

		// Calling method to convert seconds to hours, minutes and seconds
		new Question7().convertSecondsToHours(seconds);

	}

	void convertSecondsToHours(int inputSeconds) {

		int numberOfHours = inputSeconds / 60;
		int numberOfMinutes = numberOfHours % 60;
		int numberOfSeconds = inputSeconds % 60;
		numberOfHours = numberOfHours / 60;

		System.out.println("The hours, minutes, seconds conversion for given input is: " + numberOfHours + ":"
				+ numberOfMinutes + ":" + numberOfSeconds);

	}

}
