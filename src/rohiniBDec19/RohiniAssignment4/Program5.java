package rohiniBDec19.RohiniAssignment4;

/* WAP to print  reverse full pyramid */

public class Program5 {
	public static void main(String[] args) {
		int n = 6;
		PrintPattren5(n);
	}

	static void PrintPattren5(int n) {
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
