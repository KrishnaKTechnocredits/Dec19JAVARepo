/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 */

package vaishg10695.Ass_pattern_printting;

public class pattern_6 {

	public static void main(String[] args) {
		int n = 5;
		
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
