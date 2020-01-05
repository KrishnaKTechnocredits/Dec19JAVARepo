package shivaniGDec19.assignment1;

import java.util.Scanner;

public class SumOfArrayUserDefined {
	public static int sum(int[] input, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + input[i];
		}
		return (sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size = sc.nextInt();
		int[] input = new int[size];
		System.out.println("Enter elements in array to add : ");
		for (int i = 0; i < size; i++) {
			input[i] = sc.nextInt();
		}
		System.out.println("Sum : " + sum(input, size));
		sc.close();
	}

}
