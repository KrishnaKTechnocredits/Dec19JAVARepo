package chaitanyaKDec19.assignment4_JavaDecisionMaking;

/*
 * WAP to input student marks by condition:
Marks is greater than 0 and less than50--FAIILED
Marks is greater than 50 and less than 75--1st Class
Marks greater than 75 –and less than 100Distinction
 */

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting marks from user
		System.out.print("Please enter marks of a student: ");
		double marks = scanner.nextDouble();

		scanner.close();

		// Calling method to display grades
		displayResult(marks);

	}

	static void displayResult(double inputMarks) {

		// Using condition to display the grades
		if (inputMarks > 0 && inputMarks <= 50) {
			System.out.println("FAILED: Better luck next time");
		} else if (inputMarks > 50 && inputMarks <= 75) {
			System.out.println("Well Done: First Class");
		} else if (inputMarks > 75 && inputMarks <= 100) {
			System.out.println("Excellent: First Class With Distinction");
		} else
			System.out.println("You are extremely genious student who cannot be judged by our system");
	}

}
