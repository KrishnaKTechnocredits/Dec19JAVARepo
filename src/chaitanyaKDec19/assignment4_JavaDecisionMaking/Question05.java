package chaitanyaKDec19.assignment4_JavaDecisionMaking;

/*
 * Find greater of two numbers using ternary operator
 */

public class Question05 {

	private static void findMax(int inputNumOne, int inputNumTwo) {

		// Finding max of two numbers and printing it
		System.out.println("Maxium of two numbers is: " + ((inputNumOne > inputNumTwo) ? inputNumOne : inputNumTwo));
	}

	public static void main(String[] args) {

		// Calling method to find max
		findMax(-99, -199);

		findMax(50, 100);

	}

}
