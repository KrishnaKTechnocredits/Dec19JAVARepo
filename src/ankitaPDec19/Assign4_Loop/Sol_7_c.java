package ankitaPDec19.Assign4_Loop;

public class Sol_7_c {

	void pattern1() {
		int count = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count = count + 2;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Sol_7_c sol_7_c = new Sol_7_c();
		sol_7_c.pattern1();
	}

}
