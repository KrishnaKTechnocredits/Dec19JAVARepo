package shivaniGDec19.assignment1;

import java.util.Scanner;

public class AddingTwoArray {
	static void additionofarray(int[] array1, int[] array2) {
		int[] addition = new int[array1.length];
		System.out.println("Sum of both the array is: ");
		for (int i = 0 ; i < array1.length ; i ++){
			addition[i] = array1[i] + array2[i];
			System.out.println(addition[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of both the arrays you want to add: ");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		int[] array2 = new int[size];
		System.out.println("Enter the first array: ");
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the second array: ");
		for (int i = 0; i < size; i++) {
			array2[i] = sc.nextInt();
		}
		additionofarray(array1, array2);
		sc.close();
	}

}
