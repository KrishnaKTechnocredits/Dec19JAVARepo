package poonamDDec19Assignment2;
/*
 * Write a java program to find second largest element in an array of integers
 */

public class Q5_SecndLargeElement {
	static void printSecondLargest(int[] arr) {

		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}

		System.out.println("Second largest number is: " + secondLargest);

	}
	public static void main(String[] args) {
		int[] input = {10,20,35,70};
		printSecondLargest(input);
	}

}
