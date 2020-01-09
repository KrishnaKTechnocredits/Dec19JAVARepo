package chaitanyaKDec19.AssignmentTwo;

/*
 * Write a java program to check the equality of two arrays
 */

public class Question6Client {

	public static void main(String[] args) {

		int[] arrOne = { 1, 2, 3, 4, 5 };
		int[] arrTwo = { 1, 2, 3, 4, 5 };
		int[] arrThree = { 99, 199, 299, 399 };
		int[] arrFour = { 99, -199, 299, 399 };

		Question6 q6 = new Question6();
		q6.checkIfArraysEqual(arrOne, arrTwo);
		q6.checkIfArraysEqual(arrThree, arrFour);

	}

}
