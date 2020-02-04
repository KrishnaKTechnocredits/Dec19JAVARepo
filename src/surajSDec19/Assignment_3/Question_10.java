package surajSDec19.Assignment_3;

import java.util.Scanner;

/*
 * WAP to sum of two array
 * 
 * Author: Suraj Shinde
 */
public class Question_10 {

	public void sumOfArray(int[] arr1, int[] arr2, int arrSize) {
		int sum = 0;
		int totalSum = 0;
		for (int i = 0; i < arrSize; i++) {
			sum = arr1[i] + arr2[i];
			totalSum = totalSum + sum;

		}
		System.out.println("Total Sum of integer of arrays: "+totalSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int arrSize = sc.nextInt();
		int[] arr1 = new int[arrSize];
		int[] arr2 = new int[arrSize];
		System.out.println("Enter the integer of array 1 of length " + arrSize);
		for (int i = 0; i < arrSize; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the integer of array 2 of length " + arrSize);
		for (int i = 0; i < arrSize; i++) {
			arr2[i] = sc.nextInt();
		}
		Question_10 question_10 = new Question_10();
		question_10.sumOfArray(arr1, arr2, arrSize);

	}

}
