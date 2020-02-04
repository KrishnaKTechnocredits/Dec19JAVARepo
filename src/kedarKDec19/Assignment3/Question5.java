package kedarKDec19.Assignment3;

import java.util.Scanner;

public class Question5 {

	/*
	 * reverse the number;
	 * 
	 * 
	 */

	static void rev(int num) {

		int reverse = 0;
		int remainder = 0;

		while (num != 0) {

			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;

		}

		System.out.println(reverse);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		rev(num);

	}
}
