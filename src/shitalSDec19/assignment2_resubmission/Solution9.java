/* Find all differ index from given arrays 

i/p :-arr1: {10,2,9,14,3}   arr2: {10,2,18,14,13} 
 
o/p :- Values are not matching at index -> 2  Values are not matching at index -> 4  */

package shitalSDec19.assignment2_resubmission;

public class Solution9 {
	void differIndex(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i])
					System.out.println("Values are not matching at index " + i);
			}
		} else
			System.out.println("array length is mismatch");
	}

	public static void main(String args[]) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 13 };
		Solution9 solution9 = new Solution9();
		solution9.differIndex(arr1, arr2);
	}

}
