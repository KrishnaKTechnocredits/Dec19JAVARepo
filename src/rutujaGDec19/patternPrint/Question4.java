package rutujaGDec19.patternPrint;

public class Question4 {
	public static void main(String[] args) {
		for (int i = 5; i > 0; --i) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
