/*  WAP to find unique number from given array store that numbers in new array.
a. firstArray:- {1,2,3,4,2,5} 
b. secondArray:- {5,6,7,8,9,7} 
c. unique array = {1,2,3,4,5,6,7,8,9} 
i. order can be anything  */

package shitalSDec19.assignment3_resubmisson;

public class Solution14 {

	void findUniqueNo(int[] arr1, int[] arr2) {
		int[] Unique1 = new int[arr1.length + arr2.length];
		int[] Unique2 = new int[arr1.length + arr2.length];
		boolean isFound = false;
		boolean flag = false;
		int cnt = 0;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				isFound = false;
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j])
						isFound = true;
				}
				if (!isFound) {
					Unique1[cnt] = arr1[i];
					flag = false;
					for (int k = i + 1; k < arr1.length; k++) {
						if (arr1[1] == arr1[k])
							flag = true;
					}
					if (flag == true)
						System.out.println(arr1[i]);
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			isFound = false;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j])
					isFound = true;
			}
			if (!isFound) {
				Unique2[cnt] = arr2[i];
				System.out.println(arr2[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 2, 5 };
		int[] arr2 = { 5, 6, 7, 8, 9, 7 };
		Solution14 solution14 = new Solution14();
		solution14.findUniqueNo(arr1, arr2);
	}
}
