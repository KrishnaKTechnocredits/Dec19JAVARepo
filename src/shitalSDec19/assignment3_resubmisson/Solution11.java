/* WAP to find to number is palindrome or not.
 * Note:- Palindrome means given word/number is same to read from forward and backward
 *  i.e. actual number :- 12321 reverse  of actual number :- 12321 */

package shitalSDec19.assignment3_resubmisson;

import java.util.Scanner;

public class Solution11 {

	int reverse;

	void checkPalindrome(int n) {
		int original = n;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		if (original == reverse)
			System.out.println("Given number is Palindrome");
		else
			System.out.println("Given number is NOT Palindrome");
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Solution11 solution11 = new Solution11();
		solution11.checkPalindrome(num);
	}
}
