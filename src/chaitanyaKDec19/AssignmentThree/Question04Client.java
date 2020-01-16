package chaitanyaKDec19.AssignmentThree;

import java.util.Scanner;

public class Question04Client {

	public static void main(String[] args) {

		int number = 0;
		System.out.println("Please enter a number: ");

		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();

		System.out.println("User given number is: " + number + " and total of its digits is: "
				+ new Question04().sumOfDigits(number));
	}

}
