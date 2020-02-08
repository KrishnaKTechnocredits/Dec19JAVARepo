package rohiniBDec19.RohiniAssignment4;

/* WAP to print mirror of half right  pyramid */

public class Program4 {
	public static void main(String[] args) {
		int n = 6;
		PrintPattren4(n);
	}

	static void PrintPattren4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				if (j > i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
