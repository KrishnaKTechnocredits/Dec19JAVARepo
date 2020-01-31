/*  Check if array contains a number in Java? 

Hint: Your method should accept 2 parameters. Input array and number.  i/p :-  arr[] = {2,5,9,7,4,6}  number :- 8 o/p :- number is not in arr*/

package shitalSDec19.assignment2_resubmission;

public class Solution3 {
	int count = 0;

	void checkNumber(int num, int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (num == a[i])
				count++;
		}
		if (count != 0)
			System.out.println("The number " + num + " is present in given array");
		else
			System.out.println("The number " + num + " is Not present in given array");
	}

	public static void main(String args[]) {
		int number = 8;
		int arr[] = { 2, 5, 9, 7, 4, 8 };
		Solution3 solution3 = new Solution3();
		solution3.checkNumber(number, arr);
	}

}
