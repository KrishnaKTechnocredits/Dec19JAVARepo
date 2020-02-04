/* 4.	WAP to find the area and perimeter of Rectangle & Circle */

package shitalSDec19.assignment4.basicJavaProgram;

import java.util.Scanner;

public class Solution4 {

	int areaOfRectangle(int l, int w) {
		return l * w;
	}

	int perimeterOfRectangle(int l, int w) {
		return 2 * (l + w);
	}

	double areaOfCircle(int r) {
		return 3.14 * r * r;
	}

	double perimeterOfCircle(int r) {
		return 2 * 3.14 * r;
	}

	public static void main(String[] args) {
		Solution4 solution4 = new Solution4();
		System.out.println("Please enter length and width of rectangle. Also enter radius of circle");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		int radius = sc.nextInt();
		System.out.println(solution4.areaOfRectangle(length, width));
		System.out.println(solution4.perimeterOfRectangle(length, width));
		System.out.println(solution4.areaOfCircle(radius));
		System.out.println(solution4.perimeterOfCircle(radius));
	}

}
