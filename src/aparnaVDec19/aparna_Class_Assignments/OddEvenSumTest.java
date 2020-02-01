package aparnaVDec19.aparna_Class_Assignments;
/*
 * When User enters odd and even numbers then find odd and even numbers and add all odd numbers and add all even numbers separately
 */
public class OddEvenSumTest {
	static int oddNumberSum = 0;
	static int evenNumberSum = 0;

	static void oddEvenSumPrint(int number) {
		if (number % 2 == 0) {
			evenNumberSum = evenNumberSum + number;

		} else {
			oddNumberSum = oddNumberSum + number;

		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int number = Integer.parseInt(args[i]);
			oddEvenSumPrint(number);

		}
		System.out.println("Even number sum is :- " + evenNumberSum);
		System.out.println("Odd number sum is :- " + oddNumberSum);
	}
}
