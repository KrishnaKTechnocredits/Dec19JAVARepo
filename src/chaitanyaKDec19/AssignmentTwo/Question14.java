package chaitanyaKDec19.AssignmentTwo;

/*
 * WAP to print even number from the array
 */

public class Question14 {

	void displayEvenNumbers(int[] arrOne) {

		for (int i = 0; i < arrOne.length; i++) {

			if (arrOne[i] % 2 == 0) {
				System.out.print(arrOne[i]);
				System.out.print(" , ");
			}
		}
	}

}
