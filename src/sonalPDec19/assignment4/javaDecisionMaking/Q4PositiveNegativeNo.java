package sonalPDec19.assignment4.javaDecisionMaking;
/*
 * 4.	Find whether a number is negative positive or zero
 */

import java.util.Scanner;

public class Q4PositiveNegativeNo {

	static void findPositiveNegativeNo(int num) {
		if (num > 0)
			System.out.println(num + " is positive number.");
		else if (num < 0)
			System.out.println(num + " is negative number.");
		else
			System.out.println("Entered number is zero.");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter No: ");
		int n = s.nextInt();
		findPositiveNegativeNo(n);

	}

}
