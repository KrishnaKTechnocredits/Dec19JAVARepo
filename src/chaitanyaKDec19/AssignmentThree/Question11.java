package chaitanyaKDec19.AssignmentThree;

public class Question11 {

	void checkIfPalindrome(int originalNum) {

		int num = originalNum;
		int remainder = 0;
		int reverseNum = 0;

		// revering number given by user
		while (num != 0) {

			remainder = num % 10;
			reverseNum = (reverseNum * 10) + remainder;
			num = num / 10;

		}

		// Comparing number received against reversed number and printing result
		// accordingly
		if (originalNum == reverseNum)
			System.out.println("Given number " + originalNum + " is a Palindrome Number");
		else
			System.out.println("Given number " + originalNum + " is not a Palindrome Number");

	}

}
