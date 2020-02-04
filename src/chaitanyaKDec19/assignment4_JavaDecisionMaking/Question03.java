package chaitanyaKDec19.assignment4_JavaDecisionMaking;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Find whether a number is odd or even number
 */

public class Question03 {

	boolean checkOddEven(int inputNum) {

		boolean flag = false;

		if (inputNum % 2 == 0)
			flag = true;

		return flag;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isNumber = false;
		int num = 0;

		while (!isNumber) {
			try {
				System.out.print("Please enter a number: ");
				num = scanner.nextInt();
				isNumber = true;
			} catch (InputMismatchException me) {
				System.out.println("Please enter a valid number");
				scanner.next();
			}
		}

		scanner.close();

		if (new Question03().checkOddEven(num))
			System.out.println("Given number " + num + " is an Even number");
		else
			System.out.println("Given number " + num + " is an Odd number");

	}

}
