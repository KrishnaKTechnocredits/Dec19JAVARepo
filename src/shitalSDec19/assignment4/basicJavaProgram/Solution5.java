/* 5.	Write a Java program to compute simple interest */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution5 {
	static double simpleInterest(double p, double r, double n) {
		return p + p * n * r;
	}

	public static void main(String[] args) {
		System.out.println("Please enter principal, rate of interest and total no of years");
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double no = sc.nextDouble();
		System.out.println("Simple Interest is " + simpleInterest(principal, rate, no));
	}

}
