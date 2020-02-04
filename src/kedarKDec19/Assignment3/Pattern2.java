package kedarKDec19.Assignment3;

public class Pattern2 {
	static void pattern() {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			int count = 1;

			for (int j = 1; j <= i; j++) {

				System.out.print(count);
				count += 2;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern();
	}

}
