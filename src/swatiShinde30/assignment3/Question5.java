package swatiShinde30.assignment3;

import java.util.Scanner;

public class Question5 {
	static void reverse(String number) {

		for (int i = number.length() - 1; i >= 0; i--) {
			char r = number.charAt(i);
			System.out.print(r);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		String number = s.next();
		reverse(number);
		// System.out.println(total);
	}
}
