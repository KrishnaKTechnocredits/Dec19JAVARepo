/* 1) Find the missing number in integer array of 1 to 10? 
 
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that missing number in an array.  */

package shitalSDec19.assignment2_resubmission;

public class Solution1 {
	int sum = 0;
	int missingNo = 0;
	int maxNo = 0;
	int arrSum = 0;

	void findMissingNo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (maxNo < arr[i]) {
				maxNo = arr[i];
			}
			sum = maxNo * (maxNo + 1) / 2;
			arrSum = arrSum + arr[i];
			missingNo = sum - arrSum;
		}
		// System.out.println(maxNo);
		// System.out.println(sum);
		System.out.println("Missing Number is " + missingNo);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		Solution1 solution1 = new Solution1();
		solution1.findMissingNo(arr);
	}
}
