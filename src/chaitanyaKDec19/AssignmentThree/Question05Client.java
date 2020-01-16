package chaitanyaKDec19.AssignmentThree;

import java.util.Scanner;

public class Question05Client {

	public static void main(String[] args) {

		System.out.println("Please enter a number to print in reverse order:");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		System.out.println("User given number is: " + number + " & its reverse form is: "
				+ new Question05().displayNumInReverse(number));

	}

}
