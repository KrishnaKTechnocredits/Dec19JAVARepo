package surajSDec19.Assignments1;

import java.util.Scanner;
/*Write a program to add the corresponding elements of two arrays, each of size N and print
 *the sums. N can be any integer between 1 and 100. 1≤N≤100
 * 
 * Author: Suraj Shinde
 * 
 * */

public class Question_6 {
	public void sum(int arr1[], int arr2[]) {
		for (int i = 0; i <= arr1.length - 1; i++) {
			for (int j = 0; j <= arr2.length - 1; j++) {
				if (i == j) {
					int sum = 0;
					sum = arr1[i] + arr2[j];
					System.out.println("Sum of all the elements of an Array of size 4 is : " + sum);
				}
			}
		}
	}

	public int[] arrayInput1(int a) {
		int[] arr1 = new int[a];
		arr1[0] = 12;
		arr1[1] = 1;
		arr1[2] = 2;
		arr1[3] = 3;
		return arr1;
	}

	public int[] arrayInput2(int b) {
		int[] arr2 = new int[b];
		arr2[0] = 12;
		arr2[1] = 1;
		arr2[2] = 2;
		arr2[3] = 3;
		return arr2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length of array:");
		int n = input.nextInt();
		Question_6 question_6 = new Question_6();
		int[] arr1 = question_6.arrayInput1(n);
		int[] arr2 = question_6.arrayInput2(n);
		question_6.sum(arr1, arr2);
	}

}
