package chaitanyaKDec19.assignment4_JavaBasicPrograms;

import java.util.Scanner;

/*
 * WAP to find the area and perimeter of Rectangle& Circle
 */

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Accepting radius of a circle from user
		System.out.println("Please enter radius of a circle:");
		double radius = scanner.nextDouble();

		// Accepting height of a rectangle from user
		System.out.println("Please enter hight of a rectangle:");
		double height = scanner.nextDouble();

		// Accepting length of a rectangle from user
		System.out.println("Please enter length of a rectangle:");
		double length = scanner.nextDouble();

		scanner.close();

		// Calling methods to display area and perimeter of a circle and a rectangle
		calculateAreaPerimeter(radius);
		calculateAreaPerimeter(height, length);

	}

	static void calculateAreaPerimeter(double inputRadius) {

		System.out.println("Area of a circle is: " + (Math.PI * inputRadius * inputRadius));
		System.out.println("Perimeter of a circle is: " + (2 * Math.PI * inputRadius));

	}

	static void calculateAreaPerimeter(double inputHeight, double inputLength) {

		System.out.println("Area of a rectangle is: " + (inputHeight * inputLength));
		System.out.println("Perimeter of a rectangle is: " + (2 * (inputHeight + inputLength)));

	}

}
