package poojaRDec19.Assignment4;

//WAP to swap two numbers without using the thirdvariable.


public class Q9 {

	void operation(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("value of b " + b);

	}

	public static void main(String[] args) {

		Q9 q9 = new Q9();
		q9.operation(10, 20);

	}

}
