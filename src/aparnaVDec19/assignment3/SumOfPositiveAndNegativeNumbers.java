package aparnaVDec19.assignment3;

/*
 * 1) WAP which fulfill below condition
     a. WAP to find positive and negative number from the given array
     b. check the sum of individual.
     Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
     Output :- expected output of
     a. positive number = {5, 6, 14, 6, 7}
     b. negative number = {-9, -25, -14}
     c. positive number sum :- 38
     d. negative number sum :- 48
 */
import java.util.Scanner;

public class SumOfPositiveAndNegativeNumbers {

	static void findPositiveNegativeNumbers(int array[]) {
		int sumPositive = 0;
		int sumNegative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				sumPositive = sumPositive + array[i];
			} else {
				sumNegative = sumNegative + array[i];
			}
		}
		System.out.println("\n Sum of Positive Numbers = " + sumPositive);
		System.out.println("\n Sum of Negative Numbers = " + sumNegative);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:->");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Array of Integers");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			if (array[i] >= 0) {

				System.out.print("Positive Numbers are:-> " + array[i]);// To
																		// print
																		// positive
																		// numbers

			} else {
				System.out.println("Negative Numbers are:-> " + array[i]);// To
																			// print
																			// negative
																			// numbers
			}
		}
		findPositiveNegativeNumbers(array);
		sc.close();
	}
}
