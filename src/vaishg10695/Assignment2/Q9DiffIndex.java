/*9) Find all differ index from given arrays 
i/p :-   arr1: {10,2,9,14,3}   arr2: {10,2,18,14,13} 
o/p :-      Values are not matching at index -> 2 
 			Values are not matching at index -> 4 */

package vaishg10695.Assignment2;

public class Q9DiffIndex {
	void allDiffIndex(int arr1[], int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				System.out.println("Values are not maching at index-> " + i);

			}
		}

	}

	public static void main(String[] args) {
		Q9DiffIndex prgm = new Q9DiffIndex();
		int arr1[] = { 10, 9, 2, 14, 13 };
		int arr2[] = { 10, 2, 2, 14, 3 };
		prgm.allDiffIndex(arr1, arr2);

	}

}
