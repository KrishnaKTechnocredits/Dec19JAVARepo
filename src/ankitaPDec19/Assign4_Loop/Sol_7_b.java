package ankitaPDec19.Assign4_Loop;

public class Sol_7_b {

	void pattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Sol_7_b sol_7_b = new Sol_7_b();
		sol_7_b.pattern();
	}

}
