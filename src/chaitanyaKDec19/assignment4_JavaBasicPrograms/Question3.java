package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * WAP to find the square and cube of a number
 */

public class Question3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting number from user and storing in a variable
		System.out.println("Please enter a number: ");
		int num = scanner.nextInt();

		scanner.close();

		// Calling method to display square and cube of a number
		displaySquareAndCube(num);

	}

	static void displaySquareAndCube(int intputNum) {

		System.out.println("Square of a given number is: " + Math.pow(intputNum, 2));
		System.out.println("Cube of a given number is: " + Math.pow(intputNum, 3));

	}

}
