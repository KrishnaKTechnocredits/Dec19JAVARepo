package ankitaPDec19.Assign4_Loop;

public class Sol_7 {

	void pattern() {
		for (int i = 65; i <= 67; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Sol_7 sol_7 = new Sol_7();
		sol_7.pattern();
	}

}
