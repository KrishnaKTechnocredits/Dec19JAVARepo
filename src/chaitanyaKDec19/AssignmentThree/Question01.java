package chaitanyaKDec19.AssignmentThree;

public class Question01 {

	int[] positiveNum;
	int[] negativeNum;
	int positiveSum = 0;
	int negativeSum = 0;
	int num = 0;

	void displayPositiveNegativeNumSum(int[] numArr) {

		positiveNum = new int[numArr.length];
		negativeNum = new int[numArr.length];

		for (int i = 0, j = 0; i < numArr.length; i++) {

			if (numArr[i] > 0)
				positiveNum[i] = numArr[i];
			else {
				negativeNum[j] = numArr[i];
				j++;
			}
		}

		int k = 0;
		int l = 0;
		System.out.print("Positive numbers from given array are: ");
		while (k < positiveNum.length) {
			if (positiveNum[k] != 0) {
				positiveSum = positiveSum + positiveNum[k];
				System.out.print(positiveNum[k]);
				System.out.print(" , ");
			}
			k++;
		}

		System.out.println();
		System.out.print("Negative numbers from given array are: ");
		while (l < negativeNum.length) {
			if (negativeNum[l] != 0) {
				negativeSum = negativeSum + negativeNum[l];
				System.out.print(negativeNum[l]);
				System.out.print(" , ");
			}
			l++;
		}

		System.out.println();
		System.out.println("Sum of positive numbers from given array is: " + positiveSum);
		System.out.println("Sum of negative numbers from given array is: " + negativeSum);
	}

}
