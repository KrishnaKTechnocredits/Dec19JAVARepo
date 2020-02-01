package dipaPDec19.Assingment3;

/*
 * WAP which fulfill below condition
	a. WAP to find positive and negative number from the given array
	b. check the sum of individual.
	Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
 */
public class Question1 {

	static int sumPositive = 0;
	static int sumNegative = 0;

	public static void main(String[] args) {
		Question1 que = new Question1(); // Object Creation
		int[] array = { 5, 6, -9, 14, -25, 6, 7, -14 };
		System.out.println("positive number sum :- " + que.findPositive(array)); //method call for positive number
		System.out.println("Negative number sum :- " + que.findNegative(array)); //method call for negative number
	}

	int findNegative(int[] arr) {						//get negative numbers
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
				sumNegative = sumNegative + arr[i];
			}
		}
		System.out.println();
		return sumNegative;

	}

	int findPositive(int[] arr) {						//get positive numbers
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.print(arr[i] + " ");
				sumPositive = sumPositive + arr[i];
			}

		}
		System.out.println(); // new line
		return sumPositive;

	}
}
