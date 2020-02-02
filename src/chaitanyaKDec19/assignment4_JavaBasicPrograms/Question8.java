package chaitanyaKDec19.assignment4_JavaBasicPrograms;

/*
 * WAP to swap two numbers using the third variable
 */

public class Question8 {

	public static void main(String[] args) {

		// Calling method to swap the numbers
		swapNumbers(99, 56);

	}

	static void swapNumbers(int numOne, int numTwo) {

		System.out.print("Numbers before swapping: " + numOne + " & " + numTwo);

		// Swapping numbers using third variable
		int numThree = numOne;
		numOne = numTwo;
		numTwo = numThree;

		System.out.print(" and numbers after swapping are: " + numOne + " & " + numTwo);

	}

}
