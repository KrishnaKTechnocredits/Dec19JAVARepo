/*3) Draw below pattern
 * 			    *
 * 			   **
 * 			  ***
 * 			 ****
 * 			*****
 

*/

package shitalSDec19.patternPrintingAssignment;

public class Solution3 {
	// int j;

	void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if(j>i)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int n = 5;
		Solution3 solution3 = new Solution3();
		solution3.printPattern(n);
	}
}
