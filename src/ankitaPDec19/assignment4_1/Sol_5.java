/*5.Write a Java program to compute simpleinterest*/
package ankitaPDec19.assignment4_1;

public class Sol_5 {

	double interest(double p, double d, int t) {
		double si = p * d * t;
		return si;
	}

	public static void main(String[] args) {
		Sol_5 sol_5 = new Sol_5();
		System.out.println(sol_5.interest(50000, 0.85, 15));
	}
}
