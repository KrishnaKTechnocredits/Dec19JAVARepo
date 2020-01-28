package rohiniBDec19.RohiniAssignment4;

public class Program8 {
	public static void main(String[] args) {
		int n = 4;
		PrintPattren8(n);
	}

	static void PrintPattren8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (j < i)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
