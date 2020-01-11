package pravinSDec19;

public class SumOfPrimeNoTest {

	void sumPrimeNo(int[] numArray) {

		int sumPrime = 0;

		for (int i = 0; i < numArray.length; i++) {

			boolean flag = false;
			for (int j = 2; j < (numArray[i] / 2); j++) {

				if (numArray[i] % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				sumPrime = sumPrime + numArray[i];

		}

		System.out.println("Sum of Prime Numbers: " + sumPrime);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArray[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {

			numArray[i] = Integer.parseInt(args[i]);

		}
		SumOfPrimeNoTest sumofprime = new SumOfPrimeNoTest();
		sumofprime.sumPrimeNo(numArray);

	}
}