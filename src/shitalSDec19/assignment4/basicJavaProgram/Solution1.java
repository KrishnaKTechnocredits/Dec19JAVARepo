/*1.	Write a Java program to print the sum (addition), 
 * multiply, subtract, divide and remainder of two numbers.*/

package shitalSDec19.assignment4.basicJavaProgram;

public class Solution1 {
	// int sum=0;
	Solution1(int a, int b) {
		System.out.println(doSum(a, b));
		System.out.println(doSubstraction(a, b));
		System.out.println(multiply(a, b));
		divide(a,b);
	}

	static int doSum(int a, int b) {
		return a + b;
	}

	static int doSubstraction(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static void divide(int a, int b) {
		int c = a / b;
		int d = a % b;
		System.out.println("when " + a + " is divided by " + b + " then quotient is : " + c);
		System.out.println("when " + a + " is divided by " + b + " then remainder is : " + d);

	}

	public static void main(String[] args) {
		Solution1 solution1 = new Solution1(10, 20);
	}
}
