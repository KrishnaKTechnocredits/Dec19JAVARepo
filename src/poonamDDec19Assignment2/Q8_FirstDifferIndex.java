package poonamDDec19Assignment2;
/*
 * Find first differ index from given arrays
 */

public class Q8_FirstDifferIndex {
	static void displayDifferIndex(int[] arr1, int[] arr2) {

		Boolean flag = true;

		for (int i = 0; i<arr1.length; i++) {

			if (arr1[i] != arr2[i]) {
				flag = false;
				System.out.println("The first index at which values differ is: " + i);
				break;
			}
		}

		if (flag == true)
			System.out.println("Values on all index in both arrays do not differ");
	}
	public static void main(String[] args) {

		int[] input1 = { 1, 2, 4, 7, 9, 9 };
		int[] input2 = { 1, 2, 4, 6, 9, 9 };
		displayDifferIndex(input1,input2);
	}

}
