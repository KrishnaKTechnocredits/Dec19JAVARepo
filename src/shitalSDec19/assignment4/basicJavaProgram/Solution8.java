/* 8.	WAP to swap two numbers using the third variable */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution8 {
	int c;

	void swapNos(int a, int b) {
		c = a;
		a = b;
		b = c;
		System.out.println("Swapping of Numbers : " + a + " & " + b);
	}

	public static void main(String[] args) {
		System.out.println("Enter two numbers which you want to swap");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Solution8 solution8 = new Solution8();
		solution8.swapNos(a, b);
	}
}
