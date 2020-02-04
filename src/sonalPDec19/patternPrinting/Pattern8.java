package sonalPDec19.patternPrinting;
/*
 Pattern -
    * 
   * * 
  * * * 
 * * * * 
  * * * 
   * * 
    * 
 */

public class Pattern8 {

	static void pattern() {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
	
	static void pattern1() {
		int n = 3;
		for (int i = n; i >=1 ; i--) {
			for (int j = n ; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i ; k++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		pattern();
		pattern1();
		
	}

}
