/*10) Find max value at differed index i/p:- arr1: {10,2,9,14,3}  arr2: {10,2,18,14,3} 

o/p :- Values are not matching at index -> 2From (9,18) max value is 18 */

package shitalSDec19.assignment2_resubmission;

public class Solution10 {

	void maxValue(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Values are not matching at index " + i);
					if (arr1[i] > arr2[i])
						System.out.println("Max value is " + arr1[i]);
					else
						System.out.println("Max value is " + arr2[i]);
				}
			}
		}
	}

	public static void main(String args[]) {
		int[] arr1 = { 10, 2, 9, 14, 3 };
		int[] arr2 = { 10, 2, 18, 14, 3 };
		Solution10 solution10 = new Solution10();
		solution10.maxValue(arr1, arr2);
	}
}
