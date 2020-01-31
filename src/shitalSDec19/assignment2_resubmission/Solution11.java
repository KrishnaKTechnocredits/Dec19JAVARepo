/*  WAP to print unique number from the two different array 
 * a. int array1 = {1, 3, 6, 9, 7}, 
 * b. int array2 = {2, 5, 6, 9, 8} 
 * output Array :- {1, 3, 6, 9, 7, 2, 5, 8}  */

package shitalSDec19.assignment2_resubmission;

public class Solution11 {

	void findUniqueNos(int[] arr1, int[] arr2) {
		int[] Unique = new int[arr1.length + arr2.length];
		int count = 0;
		boolean isFound = false;
		for (int i = 0; i < arr1.length; i++) {
			isFound = false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr2[j])
					isFound = true;
			}
			if (!isFound) {
				Unique[count] = arr1[i];
				count++;
				System.out.println(arr1[i]);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			isFound = false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i] == arr2[j])
					isFound = true;
			}
			if (!isFound) {
				Unique[count] = arr2[i];
				count++;
				System.out.println(arr2[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 6, 9, 7 };
		int[] array2 = { 2, 5, 6, 9, 8 };
		Solution11 solution11 = new Solution11();
		solution11.findUniqueNos(array1, array2);

	}

}
