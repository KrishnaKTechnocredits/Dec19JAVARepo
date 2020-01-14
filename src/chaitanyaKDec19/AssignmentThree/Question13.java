package chaitanyaKDec19.AssignmentThree;

public class Question13 {

	void checkIfArmstrong(int originalNum) {

		int num = originalNum;
		int sum = 0;
		int remainder = 0;

		while (num != 0) {

			remainder = num % 10;
			sum = sum + (remainder * remainder * remainder);
			num = num / 10;
		}

		if (sum == originalNum)
			System.out.println("Given number: " + originalNum + " is a Palindrome Numer");
		else
			System.out.println("Given number: " + originalNum + " is a Not Palindrome Numer");

	}

}
