package chaitanyaKDec19.AssignmentThree;

public class Question14 {

	void printUniqueArray(int[] arrOne, int[] arrTwo) {

		boolean flag = false;
		int[] numArrOne = new int[arrOne.length];
		int[] numArrTwo = new int[arrTwo.length];

		for (int i = 0; i < numArrOne.length; i++) {

			for (int j = 0; j < i; j++) {

				if (arrOne[i] != arrOne[j]) {
					numArrOne[i] = arrOne[i];
					System.out.println(numArrOne[i]);
				}
			}

		}

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
