package pravinSDec19.assignment3;
/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 10
 * 
		WAP to sum of two array
	a. firstArray :- {1, 5, 9, 3, 7}
	b. secondAraay:- {1, 7, 9, 3}
	c. output :- 45
 * 
 * 
 */

public class Question10 {

	// sumOfTwoGivenArray method is used to sum of all numbers in given array

	int sumOfTwoGivenArray(int[] numArray) {

		int sum = 0;

		for (int i = 0; i < numArray.length; i++) {

			sum = sum + numArray[i];

		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question10 q10 = new Question10();

		int[] numArray1 = { 1, 5, 9, 3, 7 };
		int[] numArray2 = { 1, 7, 9, 3 };

		int total = q10.sumOfTwoGivenArray(numArray1) + q10.sumOfTwoGivenArray(numArray2);

		System.out.println("Sum of two array is: " + total);

	}
}
