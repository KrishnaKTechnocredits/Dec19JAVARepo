
/*
 * WAP to find average of user given array a. Input :- {14, 32, 19, 14, 78,36} b. Output:- 32.16 
 */
package krantikhair.assignment3;

import java.util.Scanner;

public class Question9 {

	public static void Average(int[] a) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter all the elements:");

		int sum = 0;
		float average;
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
		average = (float) sum / a.length;
		System.out.println("Average:" + average);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = s.nextInt();
		int a[] = new int[n];

		Average(a);

	}

}
