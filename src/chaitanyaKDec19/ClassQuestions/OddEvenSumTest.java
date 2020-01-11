package chaitanyaKDec19.ClassQuestions;

/*
 * Accept numbers from user and print odd,even numbers
 */

public class OddEvenSumTest {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Please enter valid arguments i.e. numbers");
		} else {
			displayOddEvenSum(args, args.length);
		}

	}

	static void displayOddEvenSum(String[] args, int argsLength) {

		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < argsLength; i++) {

			if (Integer.parseInt(args[i]) % 2 == 0)
				evenSum = evenSum + Integer.parseInt(args[i]);
			else
				oddSum = oddSum + Integer.parseInt(args[i]);
		}

		System.out.println("Total of even numbers is: " + evenSum);
		System.out.println("Total of odd numbers is: " + oddSum);

	}

}
