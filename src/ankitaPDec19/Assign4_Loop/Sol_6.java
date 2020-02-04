/*Write a program to print even/odd numbers between a range.*/
package ankitaPDec19.Assign4_Loop;

public class Sol_6 {

	void cal(int a) {
		if (a % 2 == 0)
			System.out.println("The number is even " + a);
		else
			System.out.println("The number is odd " + a);
	}

	void range(int start, int end) {
		for (int i = start; i <= end; i++) {
			int a = i;
			cal(i);
		}

	}

	public static void main(String[] args) {
		Sol_6 sol_6 = new Sol_6();
		sol_6.range(1, 20);
	}

}
