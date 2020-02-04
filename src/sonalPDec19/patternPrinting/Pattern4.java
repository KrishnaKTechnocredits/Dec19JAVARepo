package sonalPDec19.patternPrinting;
/*	
 * Pattern -
 	*****
	****
	***
	**
	*
*/

public class Pattern4 {

	static void pattern() {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		pattern();
	}
}
