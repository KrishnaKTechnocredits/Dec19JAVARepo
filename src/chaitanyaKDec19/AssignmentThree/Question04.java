package chaitanyaKDec19.AssignmentThree;

public class Question04 {

	int sumOfDigits(int num) {

		int sum = 0;
		int localNum = num;
		int remainder;

		// Separating each digit from given number and addit it
		while (localNum != 0) {

			remainder = localNum % 10;
			sum = sum + remainder;
			localNum = localNum / 10;

		}

		// returning sum to print it in calling method
		return sum;

	}

}
