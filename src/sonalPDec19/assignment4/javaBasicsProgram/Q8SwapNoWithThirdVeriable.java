package sonalPDec19.assignment4.javaBasicsProgram;
/*
 * 8.	WAP to swap two numbers using the third variable
 */

public class Q8SwapNoWithThirdVeriable {

	static void swapNoUsingVeriable(int a, int b) {
		int c = a; // c=30
		a = b; // a=50
		b = c;

		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		swapNoUsingVeriable(a, b);
	}
}
