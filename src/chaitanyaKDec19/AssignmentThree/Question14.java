package chaitanyaKDec19.AssignmentThree;

public class Question14 {

	void printUniqueArray(int[] arrOne, int[] arrTwo) {

		boolean flag = false;
		int[] numArrOne = new int[arrOne.length];
		int[] numArrTwo = new int[arrTwo.length];

		for (int i = 0; i < arrOne.length; i++) {
			// Check if the picked element is already present
			int j;
			for (j = 0; j < i; j++)
				if (arrOne[i] == arrOne[j])
					break;

			// If not picked up earlier, then store it
			if (i == j)
				numArrOne[i] = arrOne[i];
		}

		for (int i = 0; i < arrTwo.length; i++) {
			// Check if the picked element is already present
			int j;
			for (j = 0; j < i; j++)
				if (arrTwo[i] == arrTwo[j])
					break;

			// If not picked up earlier, then store it
			if (i == j)
				numArrTwo[i] = arrTwo[i];
		}

		System.out.print("Unique numbers in both arrays are: ");

		// Checking if value from first array is present in second array.
		// If not not, printing the value from first array
		for (int i = 0; i < numArrOne.length - 1; i++) {
			for (int j = 0; j < numArrTwo.length - 1; j++) {
				if (numArrOne[i] == arrTwo[j]) {
					flag = true;
					break;
				}
			}

			if (!flag && numArrOne[i] != 0) {
				System.out.print(numArrOne[i]);
				System.out.print(" , ");
			} else {
				flag = false;
			}
		}

		// Checking if value from second array is present in first array.
		// If not not, printing the value from second array

		for (int i = 0; i < numArrTwo.length - 1; i++) {
			for (int j = 0; j < numArrOne.length - 1; j++) {
				if (numArrOne[i] == numArrTwo[j]) {
					flag = true;
					break;
				}
			}

			if (!flag && numArrTwo[i] != 0) {
				System.out.print(numArrTwo[i]);
				System.out.print(" , ");
			} else {
				flag = false;
			}
		}
	}
}
