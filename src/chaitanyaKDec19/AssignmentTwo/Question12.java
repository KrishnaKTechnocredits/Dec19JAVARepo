package chaitanyaKDec19.AssignmentTwo;

/*
 * WAP to print common number from two different array
 */

public class Question12 {

	void displayCommonNumber(int[] arrOne, int[] arrTwo) {

		int[] output = new int[5];
		System.out.print("Common values in given arrays are: ");

		for (int i = 0; i < arrOne.length; i++) {

			if (arrOne[i] == arrTwo[i]) {
				output[i] = arrOne[i];
				System.out.print(output[i]);
				System.out.print(" , ");
			}
		}
	}
}
