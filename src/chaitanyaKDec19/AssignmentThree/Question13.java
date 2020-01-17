package chaitanyaKDec19.AssignmentThree;

public class Question13 {

	void checkIfArmstrong(int originalNum) {

		int num = originalNum;
		int sum = 0;
		int remainder = 0;

		// Getting each digit from number and adding cube of that digit to a variable
		while (num != 0) {

			remainder = num % 10;
			sum = sum + (remainder * remainder * remainder);
			num = num / 10;
		}

		// Checking if given number is Armstrong or not and displaying appropriate
		// information
		if (sum == originalNum)
			System.out.println("Given number: " + originalNum + " is an Armstrong Numer");
		else
			System.out.println("Given number: " + originalNum + " is not an Armstrong Numer");

	}

}
