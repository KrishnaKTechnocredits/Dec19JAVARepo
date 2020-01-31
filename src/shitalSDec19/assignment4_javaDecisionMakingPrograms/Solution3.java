/* 3.	Find whether a number is odd or even number */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

import java.util.Scanner;

public class Solution3 {
	void findOddEvenNo(int num) {
		if (num % 2 == 0)
			System.out.println("Number " + num + " is Even Number");
		else
			System.out.println("Number " + num + " is Odd Number");
	}

	public static void main(String[] args) {
		System.out.println("Please enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution3 solution3 = new Solution3();
		solution3.findOddEvenNo(n);
	}

}
