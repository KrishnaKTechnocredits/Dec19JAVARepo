/*
 * 10) WAP to sum of two array a. firstArray :- {1, 5, 9, 3,} b. secondAraay:- {1, 7,  9, 3}
 
 */

package krantikhair.assignment3;

public class Question10 {

	static void Sum(int[] b, int[] c) {
		int sum = 0;
		for (int i = 0; i < b.length && i < c.length; i++) {
			sum = sum + (c[i] + b[i]);

		}
		System.out.println("The sum of two array is " + sum);
	}

	public static void main(String[] a) {

		int[] b = { 45, 78, 58 };
		int[] c = { 7, 54, 89, };

		Sum(b, c);

	}

}
