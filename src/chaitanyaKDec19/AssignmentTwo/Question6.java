package chaitanyaKDec19.AssignmentTwo;

/*
 * Write a java program to check the equality of two arrays
 */

public class Question6 {

	void checkIfArraysEqual(int[] arrOne, int[] arrTwo) {

		Boolean flag = true;

		for (int i = 0; i < arrOne.length; i++) {

			if (arrOne[i] != arrTwo[i]) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("The given arrays are equal");
		else
			System.out.println("The given arrays are not equal");
	}

}
