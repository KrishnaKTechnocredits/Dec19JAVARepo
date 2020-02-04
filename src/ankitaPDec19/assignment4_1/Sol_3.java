/*WAP to find the square and cube of a number*/
package ankitaPDec19.assignment4_1;

public class Sol_3 {

	int square(int a) {
		int c = a * a;
		return c;
	}

	int cube(int a) {
		int c = a * a * a;
		return c;
	}

	public static void main(String[] args) {
		Sol_3 sol_3 = new Sol_3();
		System.out.println(sol_3.square(10));
		System.out.println(sol_3.cube(10));
	}

}
