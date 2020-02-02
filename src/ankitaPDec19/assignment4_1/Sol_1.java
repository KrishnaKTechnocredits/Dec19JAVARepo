/*1Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.*/
package ankitaPDec19.assignment4_1;

public class Sol_1 {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int div(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		Sol_1 sol_1 = new Sol_1();
		System.out.println(sol_1.sum(10, 20));
		System.out.println(sol_1.mul(5, 2));
		System.out.println(sol_1.sub(40, 20));
		System.out.println(sol_1.div(50, 10));
	}

}
