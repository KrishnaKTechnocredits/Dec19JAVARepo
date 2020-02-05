package sonalPDec19.assignment4.javaDecisionMaking;

import java.util.Scanner;

/*
 * Find the largest of three numbers using Logical And operator.
 */

public class Q2LargestNoWithLogicalOp {

	static void findLargestNo(int a, int b, int c) {
		if (a >= b && a > c)
			System.out.println("Largets No: " + a);
		else if (b >= a && b > c)
			System.out.println("Largest No: " + b);
		else if (c >= a && c > b)
			System.out.println("Largest No: " + c);
		else
			System.out.println("All three nos are same.");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no 1: ");
		int num1 = s.nextInt();
		System.out.println("Enter no 2: ");
		int num2 = s.nextInt();
		System.out.println("Enter no 3: ");
		int num3 = s.nextInt();
		findLargestNo(num1, num2, num3);
	}
}
