package aparnaVDec19.assignment3;

/*
 * 10) WAP to sum of two array
       a. firstArray :- {1, 5, 9, 3, 7}
       b. secondArray:- {1, 7, 9, 3}
       c. output :- 45
 */
public class SumOfTwoArray {

	static void sumOfArrayNumbers(int[] arr1, int[] arr2) {
		int total = 0;
		int total1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			total = total + arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			total1 = total1 + arr2[j];
		}

		System.out.println("Sum Of Two Arrays Output : > " + (total + total1));

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 9, 3, 7 };
		int[] arr2 = { 1, 7, 9, 3 };
		sumOfArrayNumbers(arr1, arr2);
	}
}
