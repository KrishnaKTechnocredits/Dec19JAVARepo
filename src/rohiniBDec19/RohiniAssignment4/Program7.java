package rohiniBDec19.RohiniAssignment4;

/*WAP left side Full pyramid*/

public class Program7 {
	public static void main(String[] args) {
		int n = 5;
		PrintPattren7(n);
	}

	static void PrintPattren7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
