/* 1.	Find the maximum of two numbers. */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

import java.util.Scanner;

public class Solution1 {
	void findMaxNo(double a, double b) {
		if (a > b)
			System.out.println("Maximum No from " + a + " & " + b + " is " + a);
		else
			System.out.println("Maximum No from " + a + " & " + b + " is " + b);
	}

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		System.out.println("Please enter two numbers");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		solution1.findMaxNo(a, b);

	}

}
