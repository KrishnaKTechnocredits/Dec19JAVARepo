package chaitanyaKDec19.ClassQuestions;

/*
 * Accept numbers from user and print sum of prime numbers only from given input
 */

public class PrimeNumSumTest {

	static int primeNumberTotal = 0;
	boolean flag = false;

	int checkIfPrime(int num) {

		int i;

		for (i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				break;
			}
		}
		if (i == (num / 2 + 1)) {
			primeNumberTotal = primeNumberTotal + num;
		}

		return primeNumberTotal;
	}

	int findPrimeInRange(String[] args, int argsLength) {

		for (int i = 0; i < argsLength; i++) {
			checkIfPrime(Integer.parseInt(args[i]));
		}

		return primeNumberTotal;
	}

	public static void main(String args[]) {

		PrimeNumSumTest primeNumSumTest = new PrimeNumSumTest();
		primeNumberTotal = primeNumSumTest.findPrimeInRange(args, args.length);

		System.out.print("Prime Number Total is: " + primeNumberTotal);

	}

}
