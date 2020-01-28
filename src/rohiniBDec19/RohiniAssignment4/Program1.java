package rohiniBDec19.RohiniAssignment4;

/* WAP to print full pyramid */

public class Program1 {
	public static void main(String[] args) {
		int n = 5;
		PrintPattren(n);
	}

	static void PrintPattren(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}
