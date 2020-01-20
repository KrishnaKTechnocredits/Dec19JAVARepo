package poonamDDec19Assignment2;
/*
 * Find all differ index from given arrays
 */
public class Q9_FindDifferIndex {
	static void printDiffIndex(int[] arr1, int[] arr2) {

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i])
				System.out.println("Value differs at index: " + i);
		}

	}
	public static void main(String[] args) {
		int [] input1 = {10,2,9,14,3};
		int [] input2 = {10,2,18,14,13};
		printDiffIndex(input1,input2);
	}

}
