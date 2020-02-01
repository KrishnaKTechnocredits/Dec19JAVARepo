/* WAP to find Factorial series for user defined number 
	 * a. Input number :- 5 b. Output :- 120  */

package shitalSDec19.assignment3_resubmisson;

import java.util.Scanner;

public class Solution7 {
	int fact = 1;

	int findFactorial(int n) {
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Solution7 solution7 = new Solution7();
		System.out.println("Factorial of " + num + " is " + solution7.findFactorial(num));
	}

}
