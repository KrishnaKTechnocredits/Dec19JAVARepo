package aparnaVDec19.assignment3;

import java.util.Scanner;

/*
 * 7) WAP to find Factorial series for user defined number
     a. Input number :- 5
     b. Output :- 120
 */
public class FindFactorialNumber {

	static void factorialNumber(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " is: " + factorial);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number = sc.nextInt();
		factorialNumber(number);
		sc.close();

		// if we don't put input from console then we have to write like this
		// int number=5;
		// System.out.println("Given Input Number is:-> " + number);
		// factorialNumber(number);
	}
}
