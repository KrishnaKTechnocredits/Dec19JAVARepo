/*10) Find max value at differed index 
 * i/p:-    arr1: {10,2,9,14,3}            
 * arr2: {10,2,18,14,3} */

package vaishg10695.Assignment2;

public class Q10MaxValDiffIndex {
	void maxDiffIndex(int arr1[], int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				if (arr1[i] > arr2[i])
					System.out.println(
							"Values are not maching at index: " + i + " and max value from pair is: " + arr1[i]);
				else
					System.out.println(
							"Values are not maching at index: " + i + " and max value from pair is: " + arr2[i]);

			}
		}

	}

	public static void main(String[] args) {
		Q10MaxValDiffIndex prgm = new Q10MaxValDiffIndex();
		int arr1[] = { 10, 2, 9, 14, 3 };
		int arr2[] = { 10, 2, 18, 14, 3 };
		prgm.maxDiffIndex(arr1, arr2);

	}

}
