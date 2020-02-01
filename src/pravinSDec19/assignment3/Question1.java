package pravinSDec19.assignment3;
/*
 * Created by : Pravin Sarda
 * Assignment 3 : Question 1
	WAP which fulfill below condition
	a. WAP to find positive and negative number from the given array
	b. check the sum of individual.
	Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
	Output :- expected output of
	a. positive number = {5, 6, 14, 6, 7}
	b. negative number = {-9, -25, -14}
	c. positive number sum :- 38
	d. negative number sum :- 48
 * 
 * 
 * 
 */
public class Question1 {

	// displayArray method is used to display all element of given integer array 
	static void displayArray(int[] numArray) {

		for (int i = 0; i < numArray.length; i++) {

			if (numArray[i] != 0)
				System.out.print(numArray[i] + " ");

		}

	}

	// sumOfElementsInArray method is used to find positive/negative number and add positive/negative number of given integer array
	static void findAndSumOfElementsInArray(int[] numArray) {

		int[] positiveNumArray = new int[numArray.length];
		int[] negativeNumArray = new int[numArray.length];
		int sumOfPositive = 0;
		int sumOfNegative = 0;
		int posIndex = 0;
		int negIndex = 0;

		for (int i = 0; i < numArray.length; i++) {

			if (numArray[i] > 0) {

				positiveNumArray[posIndex] = numArray[i];
				sumOfPositive = sumOfPositive + numArray[i];
				posIndex++;

			} else {
				sumOfNegative = sumOfNegative + (numArray[i] * -1);
				negativeNumArray[negIndex] = numArray[i];
				negIndex++;

			}
		}
		System.out.print("Positive Array : ");
		displayArray(positiveNumArray);
		System.out.println();
		System.out.println("Sum of Positive Array : " + sumOfPositive);

		System.out.print("Negative Array : ");
		displayArray(negativeNumArray);
		System.out.println();
		System.out.println("Sum of Negative Array : " + sumOfNegative);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArray[] = { 5, 6, -9, 14, -25, 6, 7, -14 };

		findAndSumOfElementsInArray(numArray);

	}
}