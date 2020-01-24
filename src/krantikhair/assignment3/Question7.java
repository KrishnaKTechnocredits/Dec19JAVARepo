/*
 * WAP to find Factorial series for user defined number a. Input number :- 5 b. Output :- 120 
 */
package krantikhair.assignment3;

import java.util.Scanner;

public class Question7 {

	public static void Display(int number) {
		int fact = 1;

		for (int i = 1; i <= number; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		Display(number);
	}

}
