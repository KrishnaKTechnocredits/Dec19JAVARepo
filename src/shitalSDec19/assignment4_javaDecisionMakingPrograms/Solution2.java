/* 2.	Find the largest of three numbers using Logical And operator. */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

import java.util.Scanner;

public class Solution2 {

	void findLargestNo(double a, double b, double c) {
		if (a > b && a > c)
			System.out.println("Largest No is " + a);
		else if (b > a && b > c)
			System.out.println("Largest No is " + b);
		else
			System.out.println("Largest No is " + c);

	}

	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		System.out.println("Please enter three Numbers");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		solution2.findLargestNo(a, b, c);
	}

}
