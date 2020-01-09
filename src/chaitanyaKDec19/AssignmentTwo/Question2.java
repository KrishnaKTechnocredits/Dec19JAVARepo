package chaitanyaKDec19.AssignmentTwo;

/*
 * Find duplicate number on Integer array in Java
 */

public class Question2 {

	void displayDuplicateNum(int numArr[]) {

		int count = 0;

		for (int i = 0; i < numArr.length; i++) {

			for (int j = i + 1; j < numArr.length; j++) {

				if (numArr[j] == numArr[i])
					System.out.println("Duplicate number is: " + numArr[i]);
			}

		}
	}

}
