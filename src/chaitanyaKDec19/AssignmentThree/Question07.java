package chaitanyaKDec19.AssignmentThree;

public class Question07 {

	void displayFactorial(int num) {

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		System.out.println("Factorial of given number " + num + " is: " + fact);

	}

}
