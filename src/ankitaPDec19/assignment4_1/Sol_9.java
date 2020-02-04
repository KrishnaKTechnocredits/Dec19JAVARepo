/*8.WAP to swap two numbers using the thirdvariable*/
package ankitaPDec19.assignment4_1;

public class Sol_9 {

	void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The value of a is " + a + " The value of b is " + b);
	}

	public static void main(String[] args) {
		Sol_8 sol_8 = new Sol_8();
		sol_8.swap(10, 20);
	}

}
