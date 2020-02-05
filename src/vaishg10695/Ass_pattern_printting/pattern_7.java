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

public class pattern_7 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
