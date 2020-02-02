package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * Write a Java program to compute simple interest
 */

public class Question5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting principal, rate of interest and period (years) from user
		System.out.print("Enter the Principal: ");
		float principal = scanner.nextFloat();

		System.out.print("Enter the Rate of interest: ");
		float rateOfInterest = scanner.nextFloat();

		System.out.print("Enter the Time period: ");
		float timePeriod = scanner.nextFloat();

		scanner.close();

		// Calling method to display simple interest
		new Question5().displaySimpleInterest(principal, rateOfInterest, timePeriod);

	}

	void displaySimpleInterest(float inputPrincipal, float inputRate, float inputPeriod) {

		System.out.print("Simple Interest is: " + ((inputPrincipal * inputRate * inputPeriod) / 100));

	}

}
