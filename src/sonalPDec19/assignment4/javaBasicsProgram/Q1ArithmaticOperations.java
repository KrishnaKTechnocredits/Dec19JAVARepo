package sonalPDec19.assignment4.javaBasicsProgram;

import java.util.Scanner;

/*
 * 1.	Write a Java program to print the sum (addition), multiply, subtract,
 * divide and remainder of two numbers.
 */

public class Q1ArithmaticOperations {

	void doArithmaticCalculations(int num1, int num2) {
		int a = num1 + num2;
		int m = num1 * num2;
		int s = num1 - num2;
		int d = num1 / num2;
		int r = num1 % num2;

		System.out.println("Addition of given numbers: " + a);
		System.out.println("Multiplication of given numbers: " + m);
		System.out.println("Substraction of given numbers: " + s);
		System.out.println("Division of given numbers: " + d);
		System.out.println("Reminder of given numbers: " + r);
	}

	public static void main(String[] args) {
		Q1ArithmaticOperations a = new Q1ArithmaticOperations();
		Scanner s = new Scanner(System.in);
		int count = 0;
		while (count < 2)
			try {
				System.out.println("Enter No 1: ");
				int num1 = Integer.parseInt(s.next());
				count++;
				System.out.println("Enter No 2: ");
				int num2 = Integer.parseInt(s.next());
				if (num2 != 0)
					count++;
				a.doArithmaticCalculations(num1, num2);
			} catch (ArithmeticException e) {
				System.out.println("Enter second number other than zero.");
				count = 0;
			} catch (NumberFormatException e1) {
				System.out.println("Invalid input. Enter only numeric values.");
				count = 0;
			} /*
				 * catch(Exception e2) { System.out.
				 * println("Enter valid numbers. Only numeric value is accepted and second number should be other than zero."
				 * ; count = 0; }
				 */
	}
}