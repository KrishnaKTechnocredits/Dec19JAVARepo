package rohiniBDec19.RohiniAssignment4;

/* WAP to print half left  pyramid */

public class Program3 {
	public static void main(String[] args) {
		int n = 5;
		PrintPattren3(n);
	}

	static void PrintPattren3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
