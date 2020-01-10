package shivaniGDec19.assignment2;

import java.util.Scanner;

public class MaxValueAtDifferentIndex {
	static void maxvalue(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				System.out.println("Values are not matching at index -> " + i);
				if (array1[i] > array2[i])
					System.out.println("From " + array1[i] + " and " + array2[i] + " max value is " + array1[i]);
				else
					System.out.println("From " + array1[i] + " and " + array2[i] + " max value is " + array2[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the arrays");
		int size = sc.nextInt();
		System.out.println("Enter the first array with numbers: ");
		int[] array1 = new int[size];
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the second array with numbers: ");
		int[] array2 = new int[size];
		for (int i = 0; i < size; i++) {
			array2[i] = sc.nextInt();
		}
		maxvalue(array1, array2);
		sc.close();

	}

}
