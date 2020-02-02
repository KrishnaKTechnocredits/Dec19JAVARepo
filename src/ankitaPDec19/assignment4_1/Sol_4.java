/*4.WAP to find the area and perimeter of Rectangle& Circle*/
package ankitaPDec19.assignment4_1;

public class Sol_4 {

	void cal_square(int r) {
		double c = 3.14 * (r * r);
		double d = 3.14 * (2 * r);
		System.out.println("The are of circle is " + c + " The perimeter of circle is " + d);
	}

	void cal_rectangle(int l, int w) {
		double c = l * w;
		double d = 2 * (l + w);
		System.out.println("The are of rectangle is " + c + " The perimeter of rectangle is " + d);
	}

	public static void main(String[] args) {
		Sol_4 sol_4 = new Sol_4();
		sol_4.cal_square(5);
		sol_4.cal_rectangle(2, 4);
	}

}
