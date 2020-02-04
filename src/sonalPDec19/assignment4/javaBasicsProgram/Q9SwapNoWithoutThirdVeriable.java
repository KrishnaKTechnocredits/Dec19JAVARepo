package sonalPDec19.assignment4.javaBasicsProgram;
/*
 * 9.	WAP to swap two numbers without using the third variable
 */

public class Q9SwapNoWithoutThirdVeriable {

	static void swapNoUsingVeriable(int a, int b) {
		a = a + b; // a=80
		b = a - b; // 80-50=> b=30
		a = a - b; // 80-30=> a=50

		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		swapNoUsingVeriable(a, b);
	}
}
