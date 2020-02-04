package chaitanyaKDec19.assignment4_JavaDecisionMaking;

/*
 * Find the maximum of two numbers
 */

public class Question01 {

	// Method to find max of two numbers
	static void findMax(int inputNumOne, int inputNumTwo) {

		if (inputNumOne > inputNumTwo)
			System.out.println("The maximum number is: " + inputNumOne);
		else
			System.out.println("The maximum number is: " + inputNumTwo);

	}

	public static void main(String[] args) {

		// Calling method to find max of two numbers
		findMax(110, 99);
		findMax(-99, -10);

	}

}
