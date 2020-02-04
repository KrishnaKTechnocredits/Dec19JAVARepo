package kedarKDec19.Assignment3;

import java.util.Scanner;

public class Question13 {

	static void arm(int a) {

		int num = a;
		int sum = 0;
		int remainder = 0;

		while (num != 0) {

			remainder = num % 10;
			sum = sum + (remainder * remainder * remainder);
			num = num / 10;
		}

		// Checking if given number is Armstrong or not and displaying appropriate
		// information
		if (sum == a)
			System.out.println("Given number: " + a + " is an Armstrong Numer");
		else
			System.out.println("Given number: " + a + " is not an Armstrong Numer");

	}

	public static void main(String[] args) {
		System.out.println("Enter the given number");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		arm(a);

	}

}
