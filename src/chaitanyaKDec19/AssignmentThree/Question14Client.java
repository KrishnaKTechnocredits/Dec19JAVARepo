package chaitanyaKDec19.AssignmentThree;

/*
 * WAP to find unique number from given array store that numbers in new array
 */

import chaitanyaKDec19.AssignmentTwo.Question11;

public class Question14Client {

	public static void main(String[] args) {

		// declaring two arrays
		int[] arrOne = { 1, 2, 3, 4, 2, 5 };
		int[] arrTwo = { 5, 6, 7, 8, 9, 7 };

		// calling method to display unique elements from both arrays
		new Question14().printUniqueArray(arrOne, arrTwo);

	}

}
