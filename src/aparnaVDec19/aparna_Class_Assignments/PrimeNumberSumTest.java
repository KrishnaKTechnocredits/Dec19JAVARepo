package aparnaVDec19.aparna_Class_Assignments;

/*
 * Find Prime Numbers and Sum all the Prime Numbers.
 */
public class PrimeNumberSumTest {
	static int primeNumber = 0;

	static void primeSum(int number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			primeNumber = primeNumber + number;

		}

	}

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			int number = Integer.parseInt(args[i]);
			primeSum(number);

		}
		System.out.println("Prime number sum is :- " + primeNumber);
	}

}
