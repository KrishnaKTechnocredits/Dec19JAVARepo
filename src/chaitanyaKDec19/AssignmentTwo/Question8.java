package chaitanyaKDec19.AssignmentTwo;

/*
 * Find first differ index from given arrays
 */

public class Question8 {

	void displayDifferIndex(int[] arrOne, int[] arrTwo) {

		Boolean flag = true;

		for (int i = 0; i < arrOne.length; i++) {

			if (arrOne[i] != arrTwo[i]) {
				flag = false;
				System.out.println("The first index at which values differ is: " + i);
				break;
			}
		}

		if (flag == true)
			System.out.println("Values in both arrays do not differ");
	}

}
