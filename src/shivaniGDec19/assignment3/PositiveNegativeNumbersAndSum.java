package shivaniGDec19.assignment3;

/*	WAP which fulfill below condition
a.	WAP to find positive and negative number from the given array  
b.	check the sum of individual.
*/

import java.util.Scanner;

public class PositiveNegativeNumbersAndSum {

	static void sum(int input[]) {
		int countneg = 0, countpos = 0, sumneg = 0, sumpos = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				countneg++;
				System.out.println("Negative number : " + input[i]);
				sumneg = sumneg + input[i];
			} else if (input[i] > 0) {
				countpos++;
				System.out.println("Positive number : " + input[i]);
				sumpos = sumpos + input[i];
			}
		}
		System.out.println("Count of positive numbers : " + countpos);
		System.out.println("Count of negative numbers : " + countneg);
		System.out.println("Sum of positive numbers : " + sumpos);
		System.out.println("Sum of negative numbers : " + sumneg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the array with numbers: ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sum(array);
		sc.close();
	}
}
