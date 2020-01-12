package kedarKDec19;

import java.util.Scanner;

public class ScannerClass {

	static int sumArray(int[] arr) {
		int total = 0;
		int length = arr.length;
		int index = 0;
		while (index < length) {
			total = total + arr[index];
			index++;

		}
		return total;

	}

	public static void main(String[] args) {
		System.out.println("Total number of elements");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[s.nextInt()];
		int i = 0;
		while (i < arr.length)
			arr[i] = s.nextInt();
		i++;
	}
}
