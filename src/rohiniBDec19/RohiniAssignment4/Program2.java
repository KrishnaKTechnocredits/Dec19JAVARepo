package rohiniBDec19.RohiniAssignment4;

/* WAP to print half right pyramid */

public class Program2 {

	public static void main(String[] args) {
		int n = 6;
		PrintPattren2(n);
	}

	static void PrintPattren2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
