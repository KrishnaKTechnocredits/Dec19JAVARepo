/* 7.	Write a Java program to convert seconds to hour, minute and seconds. */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution7 {
	static double min;
	static double hr;

	static void convertSeconds(int s) {
		min = (double) s/60;
		hr = (double) s/3600;
		System.out.println(s + " seconds when converted to minutes are " + min);
		System.out.println(s + " seconds when converted to hours are " + hr);
	}

	public static void main(String[] args) {
		System.out.println("Please enter time in seconds");
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		convertSeconds(sec);

	}
}
