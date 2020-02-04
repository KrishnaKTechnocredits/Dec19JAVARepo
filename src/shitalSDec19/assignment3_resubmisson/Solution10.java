/*  WAP to sum of two array 
 * a. firstArray :- {1, 5, 9, 3, 7} 
 * b. secondAraay:- {1, 7,  9, 3}
c. output :- 45  */

package shitalSDec19.assignment3_resubmisson;

public class Solution10 {

	int doSum(int[] arr1) {
		int sum = 0;
		int i = 0;
		while (i < arr1.length) {
			sum = sum + arr1[i];
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 9, 3, 7 };
		int arr2[] = { 1, 7, 9, 3 };
		Solution10 solution10 = new Solution10();
		int sum = solution10.doSum(arr1);
		int sum1 = solution10.doSum(arr2);
		System.out.println("total sum of both the arrays are " + (sum + sum1));
	}

}
