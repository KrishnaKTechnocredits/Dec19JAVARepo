package rohiniBDec19.RohiniAssignment4;

/*To Print right pyramid*/

public class Program6 {
	public static void main(String[] args) {
		int n = 5;
		PrintPattren6(n);
	}

	static void PrintPattren6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}
