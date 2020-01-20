/* Find duplicate number on Integer array in Java? 

Hint: There is exactly one number is repeated in the array. You need to write a program to find that duplicate number. For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. */
package shitalSDec19.assignment2_resubmission;

public class Solution2 {
	void findDuplicateNumber(int[] d) {
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] == d[j])
					System.out.println("The duplicate number is " + d[j]);
			}

		}

	}

	public static void main(String args[]) {
		int[] num = { 0, 3, 1, 2, 3 };
		Solution2 solution2 = new Solution2();
		solution2.findDuplicateNumber(num);
	}
}
