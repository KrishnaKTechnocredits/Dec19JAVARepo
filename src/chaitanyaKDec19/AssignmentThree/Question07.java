package chaitanyaKDec19.AssignmentThree;

public class Question07 {

	void displayFactorial(int num) {

		int fact = 1;

		// getting the factorial value and storing it in a variable
		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		// displaying factorial value of give number
		System.out.println("Factorial of given number " + num + " is: " + fact);

	}

}
