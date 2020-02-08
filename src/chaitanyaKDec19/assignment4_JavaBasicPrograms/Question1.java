package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
 */

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting first number from user and storing it in a variable
		System.out.println("Please enter first number:");
		int numOne = scanner.nextInt();

		// Accepting second number from user and storing it in a variable
		System.out.println("Please enter second number:");
		int numTwo = scanner.nextInt();

		scanner.close();

		System.out.println("Addition of given numbers " + numOne + " and " + numTwo + " is: "
				+ new Question1().addition(numOne, numTwo));

		System.out.println("Multiplication of given numbers " + numOne + " and " + numTwo + " is: "
				+ new Question1().multiply(numOne, numTwo));

		System.out.println("Subtraction of given numbers " + numOne + " and " + numTwo + " is: "
				+ new Question1().subtract(numOne, numTwo));

		System.out.println("Remainder of division of given numbers " + numOne + " and " + numTwo + " is: "
				+ new Question1().divide(numOne, numTwo));
	}

	// Method for addition
	int addition(int x, int y) {
		return x + y;
	}

	// Method for multiplication
	int multiply(int x, int y) {
		return x * y;
	}

	// Method for subtraction
	int subtract(int x, int y) {
		return x - y;
	}

	// Method for division and returning remainder
	double divide(int x, int y) {
		double remainder = x % y;
		return remainder;
	}

}
