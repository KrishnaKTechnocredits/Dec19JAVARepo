package shivaniGDec19.assignment2;

import java.util.Scanner;

public class EvenNumberArray {
	static void even(int[] array) {
		System.out.println("Even array output: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.println(array[i]);
		}
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
		even(array);
		sc.close();
	}
}
