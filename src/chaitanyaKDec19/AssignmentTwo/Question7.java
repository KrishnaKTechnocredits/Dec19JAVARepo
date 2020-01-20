package chaitanyaKDec19.AssignmentTwo;

/*
 * Find all pairs on integer array whose sum is equal to given number
 */

public class Question7 {

	static void displayNumbers(int[] numArr, int sum) {

		for (int i = 0; i < numArr.length; i++) {

			for (int j = i; j < numArr.length; j++) {

				if ((numArr[j] + numArr[i]) == sum)
					System.out.println("Integer numbers, whose sum is equal to " + sum + " are: (" + numArr[i] + " , "
							+ numArr[j] + ")");
			}
		}
	}

}
