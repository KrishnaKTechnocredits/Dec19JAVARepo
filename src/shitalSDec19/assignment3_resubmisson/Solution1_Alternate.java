
/*  WAP which fulfill below condition 
 * a. WAP to find positive and negative number from the given array  
b. check the sum of individual. 
 
Input array;- {5, 6, -9, 14, -25, 6, 7, -14} 
Output :- expected output of a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14} 
c. positive number sum :- 38 
d. negative number sum :- 48  */

package shitalSDec19.assignment3_resubmisson;

public class Solution1_Alternate {
	void findPositiveNos(int[] n) {
		int[] psum = new int[n.length];
		int[] nsum = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 0)
				System.out.println("positive numbers = " + psum[i]);
			else
				System.out.println(" negative numbers = " + n[i]);
		}
		System.out.println("sum of positive numbers : " + psum + " and sum of negative numbers : " + nsum);
	}

	public static void main(String args[]) {
		int[] s = { 5, 6, -9, 14, -25, 6, 7, -14 };
		Solution1 solution1 = new Solution1();
		solution1.findPositiveNos(s);
	}

}
