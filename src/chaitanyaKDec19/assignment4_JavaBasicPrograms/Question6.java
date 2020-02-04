package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * Write a Java program to convert temperature from Fahrenheit to Celsius degree
 */

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting temprature from user in Fahrenheit
		System.out.print("Enter temperature in Fahrenheit: ");
		float temperature = scanner.nextFloat();

		scanner.close();

		// Calling method to convert Fahrenheit to Celsius
		System.out.println("Temperature in Celsius is: " + convertFahrenheitToCelsium(temperature));

	}

	static float convertFahrenheitToCelsium(float inputTemp) {

		return ((inputTemp - 32) * 5 / 9);

	}

}
