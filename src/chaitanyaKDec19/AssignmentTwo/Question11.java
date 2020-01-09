package chaitanyaKDec19.AssignmentTwo;

/*
 * WAP to print unique number from the two different array
 */

public class Question11 {

	void displayUniqueNumers(int[] arrOne, int[] arrTwo) {

		boolean flag = false;

		System.out.print("Unique numbers in both arrays are: ");

		for (int i = 0; i < arrOne.length; i++) {
			for (int j = 0; j < arrTwo.length; j++) {
				if (arrOne[i] == arrTwo[j]) {
					System.out.print(arrOne[i]);
					System.out.print(" , ");
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.print(arrOne[i]);
				System.out.print(" , ");
			} else {
				flag = false;
			}
		}
		for (int i = 0; i < arrTwo.length; i++) {
			for (int j = 0; j < arrOne.length; j++) {
				if (arrOne[i] == arrTwo[j]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.print(arrTwo[i]);
				System.out.print(" , ");
			} else {
				flag = false;
			}
		}

	}

}
