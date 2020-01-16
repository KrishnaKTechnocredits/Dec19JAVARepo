package chaitanyaKDec19.AssignmentThree;

import java.util.Scanner;

public class Question09Client {

	public static void main(String[] args) {

		int size = 0;
		System.out.println("Please specify for how many numbers you would like to find average: ");

		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		int[] numberArray = new int[size];

		for (int i = 0; i < numberArray.length; i++) {

			System.out.println("Please enter a number");
			numberArray[i] = scanner.nextInt();

		}

		new Question09().displayAverage(numberArray);

	}

}
