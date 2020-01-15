package pravinSDec19;

public class OddEvenSumTest {

	void total(int[] numArray) {

		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < numArray.length; i++) {

			if (numArray[i] % 2 == 0)
				evenSum = evenSum + numArray[i];
			else
				oddSum = oddSum + numArray[i];

		}
		
		System.out.println("Sum of Even Number: "+evenSum);
		System.out.println("Sum of Odd Number: "+oddSum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArray[] = new int[args.length];

		for (int i = 0; i < args.length; i++) {

			numArray[i] = Integer.parseInt(args[i]);

		}
		OddEvenSumTest oddevensum1 = new OddEvenSumTest();
		oddevensum1.total(numArray);

	}
}