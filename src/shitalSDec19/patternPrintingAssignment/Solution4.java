/* 4) Draw below pattern
 * 		*****
 * 		****
 * 		***
 * 		**
 * 		*
 */

package shitalSDec19.patternPrintingAssignment;

public class Solution4 {
	void printPattern(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		Solution4 solution4 = new Solution4();
		solution4.printPattern(n);
	}
}
