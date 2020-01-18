package assignment3;
/*
 * WAP to sum of two array
	a. firstArray :- {1, 5, 9, 3, 7}
	b. secondAraay:- {1, 7, 9, 3}
	c. output :- 45
 */

public class SumOfArrays {

	static int doSumOfArrays(int[] input1, int[] input2) {
		int totalSum = 0;
		int sumOfArray1 = 0;
		int sumOfArray2 = 0;

		for (int i = 0; i < input1.length; i++) {
			sumOfArray1 = sumOfArray1 + input1[i];
		}

		for (int i = 0; i < input2.length; i++) {
			sumOfArray2 = sumOfArray2 + input2[i];
		}

		totalSum = sumOfArray1 + sumOfArray2;
		return totalSum;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 5, 9, 3, 7 };
		int[] array2 = { 1, 7, 9, 3 };
		System.out.print("Sum of two arrays: " + doSumOfArrays(array1, array2));
	}

}
