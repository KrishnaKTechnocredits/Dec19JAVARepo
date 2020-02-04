package swatiShinde30.assignment3;

import java.util.Scanner;

public class Assign2Question1 {

	static void missingNum(int[] arr, int length, int total) {
		int missingElement = 0;
		for (int i = 0; i < length; i++) {
			total = total - arr[i];
			missingElement = total;
		}
		System.out.println("missing element is " + missingElement);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int total = size * (size + 1) / 2;
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int length = arr.length;
		missingNum(arr, length, total);

	}

}