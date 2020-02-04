package chaitanyaKDec19.assignment4_JavaDecisionMaking;

import java.util.Scanner;

/*
 * Write a Java Program and create Calculator using switch statement
 */

public class Question07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting numbers and operation to be performed from user
		System.out.print("Please enter first number: ");
		double numOne = scanner.nextDouble();

		System.out.print("Please enter second number: ");
		double numTwo = scanner.nextDouble();

		System.out.print("Please enter one of the operation: +, -, *, / : ");
		char operation = scanner.next().charAt(0);

		scanner.close();

		// Calling method to perform operation given by user
		operation(operation, numOne, numTwo);

	}

	static void operation(char inputOperation, double inputNumOne, double inputNumTwo) {

		switch (inputOperation) {

		case '+':
			System.out.println("Addition of two numbers is: " + (inputNumOne + inputNumTwo));
			break;

		case '-':
			System.out.println("Subtraction of two numbers is: " + (inputNumOne - inputNumTwo));
			break;

		case '*':
			System.out.println("Multiplication of two numbers is: " + (inputNumOne * inputNumTwo));
			break;

		case '/':
			System.out.println("Division of two numbers is: " + (inputNumOne / inputNumTwo));
			break;

		default:
			System.out.println("Invalid Operator: Please enter operator from the given list only");
			break;

		}

	}

}
