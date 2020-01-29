/*6.Write a Java program to convert temperature from Fahrenheit to Celsiusdegree.*/
package ankitaPDec19.assignment4_1;

public class Sol_6 {

	double far_cel(int f) {
		double cel = ((f - 32) * 5) / 9;
		return cel;
	}

	public static void main(String[] args) {
		Sol_6 sol_6 = new Sol_6();
		System.out.println(sol_6.far_cel(50));
	}
}
