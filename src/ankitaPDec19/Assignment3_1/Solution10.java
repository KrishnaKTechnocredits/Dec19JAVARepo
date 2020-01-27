/*10) WAP to sum of two array
a. firstArray :- {1, 5, 9, 3, 7}
b. secondAraay:- {1, 7, 9, 3}
c. output :- 45*/
package ankitaPDec19.Assignment3_1;

public class Solution10 {

	int totsum;

	public static void main(String[] args) {
		int[] a1 = { 1, 5, 9, 3, 7 };
		int[] a2 = { 1, 7, 9, 3 };
		Solution10 solution10 = new Solution10();
		solution10.add(a1, a2);
	}

	void add(int[] a1, int[] a2) {
		int sum = 0;
		for (int i = 0; i < a1.length; i++) {
			sum = sum + a1[i];
		}
		totalsum(sum, a2);
	}

	void totalsum(int sum, int[] a2) {
		totsum = sum;
		for (int j = 0; j <= a2.length - 1; j++) {
			totsum = totsum + a2[j];
		}
		System.out.println(totsum);
	}
}
