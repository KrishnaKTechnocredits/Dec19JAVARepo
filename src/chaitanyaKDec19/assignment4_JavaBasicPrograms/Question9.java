package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * WAP to swap two numbers without using the third variable
 */

public class Question9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting numbers from user and storing them in variables
		System.out.print("Please enter first number: ");
		int numOne = scanner.nextInt();

		System.out.print("Please enter second number: ");
		int numTwo = scanner.nextInt();

		scanner.close();

		// Calling method to swap numbers
		swapNumbers(numOne, numTwo);

	}

	static void swapNumbers(int inputNumOne, int inputNumTwo) {

		System.out.println("Numbers before swapping: " + inputNumOne + " & " + inputNumTwo);

		inputNumOne = inputNumOne + inputNumTwo;
		inputNumTwo = inputNumOne - inputNumTwo;
		inputNumOne = inputNumOne - inputNumTwo;

		System.out.println("Numbers after swapping: " + inputNumOne + " & " + inputNumTwo);

	}

}
