package chaitanyaKDec19.AssignmentTwo;

/*
 * Find all differ index from given arrays
 */

public class Question9 {

	void displayDifferIndices(int[] arrOne, int[] arrTwo) {

		for (int i = 0; i < arrOne.length; i++) {

			if (arrOne[i] != arrTwo[i])
				System.out.println("Indix at which value differ is: " + i);
		}

	}

}
