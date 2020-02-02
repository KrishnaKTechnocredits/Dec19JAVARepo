/* 3.	WAP to find the square and cube of anumber */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution3 {

	int findSquare(int num) {
		// int sq = num*num; returnsq;
		return num * num;
	}

	int findCube(int num) {
		// int cube = num*num*num; return cube;
		return num * num * num;
	}

	public static void main(String[] args) {
		Solution3 solution3 = new Solution3();
		System.out.println("Please enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Square of no " + num + " is " + solution3.findSquare(num));
		System.out.println("Cube of no " + num + " is " + solution3.findCube(num));
	}

}
