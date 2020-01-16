package chaitanyaKDec19.AssignmentThree;

public class Question10 {

	void displaySum(int[] arrOne, int[] arrTwo) {

		int sum = 0;
		int i = 0, j = 0;

		// getting sum of all integers from first array
		while (i < arrOne.length) {
			sum = sum + arrOne[i];
			i++;
		}

		// getting sum of all integers from second array
		while (j < arrTwo.length) {
			sum = sum + arrTwo[j];
			j++;
		}

		// displaying sum of all integers from both arrays
		System.out.println("Sum of all numbers from two arrays is: " + sum);

	}

}
