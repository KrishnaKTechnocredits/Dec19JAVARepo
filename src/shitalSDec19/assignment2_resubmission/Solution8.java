/*Find first differ index from given arrays 

i/p :- arr1: {10,2,9,14,3} arr2: {10,2,18,14,3} Values are not matching at index -> 2 */

package shitalSDec19.assignment2_resubmission;

public class Solution8 {
	void differIndex(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Values are not matching at index " + i);
					break;
				}
			}
		} else
			System.out.println("array length is mismatch");
	}

	public static void main(String args[]) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		Solution8 solution8 = new Solution8();
		solution8.differIndex(arr1, arr2);
	}

}
