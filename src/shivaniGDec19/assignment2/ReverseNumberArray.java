package shivaniGDec19.assignment2;

import java.util.Scanner;

public class ReverseNumberArray {
	static void reverse(int[] array) {
		System.out.println("Reverse array is : ");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
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
		reverse(array);
		sc.close();
	}

}
