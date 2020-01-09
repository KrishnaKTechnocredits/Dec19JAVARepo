package shivaniGDec19.assignment2;

import java.util.Scanner;

public class EqualityOfArray {
	static void equality(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				System.out.println("Both the arrays are not equal");
				break;
			} else
				System.out.println("Two arrays are equal");
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
		equality(array1, array2);
		sc.close();

	}

}
