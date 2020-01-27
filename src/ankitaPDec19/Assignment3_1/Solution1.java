/*1)a. WAP to find positive and negative number from the given array.b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48
*/
package ankitaPDec19.Assignment3_1;

public class Solution1 {
	public static void main(String[] args) {
		int[] a = { 5, 6, -9, 14, -25, 6, 7, -14 };
		Solution1 solution1 = new Solution1();
		solution1.display(a);
	}

	void display(int[] a) {
		String pnum = "";
		int psum = 0;
		String nnum = "";
		int nsum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				pnum = pnum + a[i];
				psum = psum + a[i];
			} else {
				nnum = nnum + a[i];
				nsum = nsum + a[i];
			}
		}
		System.out.println("The positive number is " + pnum);
		System.out.println("The  negative number is " + nnum);
		System.out.println("positive number sum: " + psum);
		System.out.println("negative number sum: " + (nsum * (-1)));
	}
}
