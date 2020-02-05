package sonalPDec19.assignment4.javaDecisionMaking;
/*
 * 1.	Find the maximum of two numbers
 */

import java.util.Scanner;

public class Q1MaxNumber {
	static void findMaxNo(int num1, int num2) {
		if (num1 > num2)
			System.out.println("Max number: " + num1);
		else if (num1 < num2)
			System.out.println("Max number: " + num2);
		else
			System.out.println("Both numbers are same.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter no 2: ");
		int num2 = sc.nextInt();
		findMaxNo(num1, num2);
	}
}
