package swatiShinde30.patternPrinting;

public class Question3 {

	static void pattern(int n) {
		for (int i = 1; i <= 4; i++) {
			int count = 1;
			for (int j = 4; j <= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.println(count++);

				}
			}
		}
	}

	public static void main(String[] args) {
		int n = 5;
		pattern(n);
	}

}
