package chaitanyaKDec19.AssignmentThree;

public class Question10 {

	void displaySum(int[] arrOne, int[] arrTwo) {

		int sum = 0;
		int i = 0, j = 0;

		while (i < arrOne.length) {
			sum = sum + arrOne[i];
			i++;
		}

		while (j < arrTwo.length) {
			sum = sum + arrTwo[j];
			j++;
		}

		System.out.println("Sum of all numbers from two arrays is: " + sum);

	}

}
