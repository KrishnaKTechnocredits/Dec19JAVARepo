package chaitanyaKDec19.assignment4_JavaDecisionMaking;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter marks of a student: ");
		double marks = scanner.nextDouble();

		scanner.close();

		displayResult(marks);

	}

	static void displayResult(double inputMarks) {

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
