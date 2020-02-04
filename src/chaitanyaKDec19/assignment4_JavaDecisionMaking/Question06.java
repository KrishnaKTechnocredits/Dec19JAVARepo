package chaitanyaKDec19.assignment4_JavaDecisionMaking;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Write a Java program that takes a year from user and print whether that year is a leap year or not
 */

public class Question06 {

	static boolean checkLeapYear(int inputYear) {

		boolean isLeapYear = false;

		if (inputYear % 400 == 0) {
			isLeapYear = true;
		} else if (inputYear % 100 == 0) {
			isLeapYear = false;
		} else if (inputYear % 4 == 0) {
			isLeapYear = true;
		}

		return isLeapYear;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int year = 0;
		boolean isNumber = false;

		while (!isNumber) {

			try {
				System.out.print("Please enter a year: ");
				year = scanner.nextInt();
				isNumber = true;
			} catch (InputMismatchException me) {
				System.out.println("Please enter a valid year");
				scanner.next();
			}
		}

		if (checkLeapYear(year))
			System.out.println("Given year " + year + " is a Leap Year");
		else
			System.out.println("Given year " + year + " is a not Leap Year");

	}

}
