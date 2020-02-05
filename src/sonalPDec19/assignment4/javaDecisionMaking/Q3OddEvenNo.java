package sonalPDec19.assignment4.javaDecisionMaking;

import java.util.Scanner;

/*
 * 3.	Find whether a number is odd or even number
 */

public class Q3OddEvenNo {

	static void findOddEven(int num) {
		if (num % 2 == 0)
			System.out.println(num + " is even number.");
		else
			System.out.println(num + " is odd number.");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter No: ");
		int n = s.nextInt();
		findOddEven(n);
	}
}
