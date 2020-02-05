/*
 * * * * *
 * * * *
 * * * 
 * *
 * 
 */

package vaishg10695.Ass_pattern_printting;

public class pattern_4 {

	public static void main(String[] args) {

		int n = 5;
		for (int i =0; i <= n; i++) {
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
