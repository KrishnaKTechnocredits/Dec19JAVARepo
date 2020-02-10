/* 10.	Write a program to calculate area of Rectangle, area of Triangle and 
 * area of Circle using switch statement. Make it a menu driven program..
Formulas:-Area Of rectangle=length*breadth Area of triangle=1/2*base*height
Area of Circle=3.14*radius*radius
 */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

public class Solution10 {

	double findAreaOfRectangle(double length, double breadth) {
		return length * breadth;
	}

	double findAreaOfTriangle(double base, double height) {
		return ((double)1 / 2) * (base * height);
	}

	double findAreaOfCircle(double radius) {
		return 3.14 * radius * radius;

	}

	public static void main(String[] args) {

		Solution10 solution10 = new Solution10();
		double length = 10.1;
		double breadth = 4.3;
		double base = 3.5;
		double height = 5.5;
		double radius = 7.6;
		System.out.println(solution10.findAreaOfRectangle(length, breadth));
		System.out.println(solution10.findAreaOfTriangle(base, height));
		System.out.println(solution10.findAreaOfCircle(radius));
	}
}
