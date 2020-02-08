/*Write a Java program to convert seconds to hour, minute and seconds.*/
package ankitaPDec19.assignment4_1;

public class Sol_7 {

	void convert(int s) {
		int hrs = s / 3600;
		int min = s / 60;
		System.out.println("The conversion to hours is " + hrs + " and the conversion to min is " + min);
	}

	public static void main(String[] args) {
		Sol_7 sol_7 = new Sol_7();
		sol_7.convert(7200);
	}
}