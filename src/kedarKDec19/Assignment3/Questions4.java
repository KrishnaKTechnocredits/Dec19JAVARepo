package kedarKDec19.Assignment3;

import java.util.Scanner;

public class Questions4 {

	/*
	 * find sum of digits of user defined number;
	 * 
	 * 
	 */
	static void sum(int num) {

		int sum = 0;
		int remainder = 0;

		while (num != 0) {

			remainder = num % 10;
			sum = sum + remainder;
			num = num / 10;

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = s.nextInt();
		sum(num);

	}

}
