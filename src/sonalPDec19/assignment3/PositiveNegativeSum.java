package assignment3;

/*
 * WAP which fulfill below condition-
	a. WAP to find positive and negative number from the given array
	b. check the sum of individual.
 */

public class PositiveNegativeSum {

	static void sumPositiveNegative(int[] input) {
		/*
		 * method 'sumPositiveNegative' will identify positive numbers and negative
		 * numbers from given array. Do the sum and print.
		 */

		int sumPositive = 0;
		int sumNegative = 0;
		String positiveNo = "";
		String negativeNo = "";
		int positiveNoArray[] = new int[input.length];
		int negativeNoArray[] = new int[input.length];
		int positiveNoArrayIndex = 0;
		int negativeNoArrayIndex = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0) {
				sumPositive = sumPositive + input[i];
				positiveNoArray[positiveNoArrayIndex] = input[i];
				positiveNoArrayIndex++;

			} else {
				sumNegative = sumNegative + input[i];
				negativeNoArray[negativeNoArrayIndex] = input[i];
				negativeNoArrayIndex++;
			}
		}

		for (int i = 0; i < positiveNoArray.length; i++) {
			positiveNo = positiveNo + positiveNoArray[i] + " ";
		}

		for (int i = 0; i < negativeNoArray.length; i++) {
			negativeNo = negativeNo + negativeNoArray[i] + " ";
		}
		System.out.println("Positive Numbers= " + positiveNo);
		System.out.println("Negative Numbers= " + negativeNo);
		System.out.println("Postive numbers sum= " + sumPositive);
		System.out.println("Negative numbers sum= " + sumNegative);
	}

	public static void main(String[] args) {
		int array[] = { 10, -20, -13, 26, 19, 18, -15 };
		sumPositiveNegative(array);
	}

}
