package chaitanyaKDec19.assignment4_JavaDecisionMaking;

/*
 * Write a program to calculate area of Rectangle, area of Triangle and area of Circle usingswitch statement. Make it a menu drivenprogram..
Formulas:-Area Of rectangle=length*breadth Area oftriangle=1/2*base*height
Area ofCircle=3.14*radius*radius
 */

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Displaying MENU to user and getting input from user
		System.out.println("Please note our MENU has changed:");
		System.out.println("1. Area of a Rectangle");
		System.out.println("2. Area of a Triangle");
		System.out.println("3. Area of a circle");
		System.out.print("Please select one of the menu: ");
		int option = scanner.nextInt();

		// Calling method to take approriate action as per menu selection
		displayArea(option);
	}

	static void displayArea(int inputOption) {

		Scanner scanner = new Scanner(System.in);

		double length = 0.0, breadth = 0.0, base = 0.0, height = 0.0, radius = 0.0;

		switch (inputOption) {
		case 1:
			System.out.print("Please enter length of a Rectangle: ");
			length = scanner.nextDouble();
			System.out.print("Please enter breadth of a Rectangle: ");
			breadth = scanner.nextDouble();
			System.out.println("Area of a Rectangle is: " + (length * breadth));
			break;

		case 2:
			System.out.print("Please enter height of a Triangle: ");
			height = scanner.nextDouble();
			System.out.print("Please enter base of a Triangle: ");
			base = scanner.nextDouble();
			System.out.println("Area of a Triangle is: " + (0.5 * height * base));
			break;

		case 3:
			System.out.print("Please enter radius of a Triangle: ");
			radius = scanner.nextDouble();
			System.out.println("Area of a Circle is: " + (Math.PI * radius * radius));
			break;

		}

		scanner.close();

	}
}
