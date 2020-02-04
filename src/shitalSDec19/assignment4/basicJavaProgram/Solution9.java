/* 9.	WAP to swap two numbers without using the third variable */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution9 {

	void swapNos(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapping of two Numbers : " + a + " & " + b);

	}

	public static void main(String[] args) {
		Solution9 solution9 = new Solution9();
		System.out.println("Please enter two numbers for swapping");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		solution9.swapNos(a, b);
	}

}
