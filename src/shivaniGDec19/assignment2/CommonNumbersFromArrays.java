package shivaniGDec19.assignment2;

import java.util.Scanner;

public class CommonNumbersFromArrays {
	static void common(int[] array1, int[] array2) {
		System.out.println("Commom Numbers from two diffrent array are: ");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
				}

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
		common(array1, array2);
		sc.close();

	}

}
