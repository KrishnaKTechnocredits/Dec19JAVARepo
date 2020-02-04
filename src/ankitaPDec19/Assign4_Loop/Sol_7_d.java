package ankitaPDec19.Assign4_Loop;

public class Sol_7_d {

	void pattern() {
		int count = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Sol_7_d sol_7_d = new Sol_7_d();
		sol_7_d.pattern();
	}

}
