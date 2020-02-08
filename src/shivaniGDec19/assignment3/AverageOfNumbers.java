package shivaniGDec19.assignment3;

import java.util.Scanner;

public class AverageOfNumbers {
	int sum;
	double avg;

	void average(int a[]) {
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			int n = a.length;
			avg = sum / n;
		}
		System.out.println("Average is : " + avg);
	}

	public static void main(String[] args) {
		AverageOfNumbers avg = new AverageOfNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of String array");
		int length = sc.nextInt();

		int arr[] = new int[length];

		System.out.println("Please enter array elements");

		for (int i = 0; i < arr.length; i++) {
			int userInput = sc.nextInt();
			arr[i] = userInput;
		}

		avg.average(arr);

		sc.close();

	}

}