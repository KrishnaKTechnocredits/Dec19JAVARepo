package sonalPDec19.patternPrinting;
/*	
 Pattern -
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
public class Pattern6 {

	static void pattern() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		int m = 4;
		for (int i = m; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		pattern();
	}
}
