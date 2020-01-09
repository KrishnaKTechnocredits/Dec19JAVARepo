package chaitanyaKDec19.AssignmentTwo;

/*
 * WAP to reveres array
 */

public class Question13 {

	void displayReverseArray(int[] arrOne) {

		int[] output = new int[arrOne.length];
		int j = arrOne.length;

		for (int i = 0; i < arrOne.length; i++) {

			output[j - 1] = arrOne[i];
			j = j - 1;
		}

		System.out.print("Printing array in reverse order: ");

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
			System.out.print(" , ");
		}

	}
}
