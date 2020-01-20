package chaitanyaKDec19.AssignmentTwo;

/*
 * Write a java program to find second largest element in an array of integers
 */

public class Question5 {

	void printSecondLargest(int[] arrOne) {

		int largest = arrOne[0];
		int secondLargest = arrOne[0];

		for (int i = 0; i < arrOne.length; i++) {

			if (arrOne[i] > largest) {
				secondLargest = largest;
				largest = arrOne[i];
			} else if (arrOne[i] > secondLargest) {
				secondLargest = arrOne[i];
			}
		}

		System.out.println("Second largest number is: " + secondLargest);

	}

}
