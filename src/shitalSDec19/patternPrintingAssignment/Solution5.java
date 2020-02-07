/* 5) Draw below pattern
 * 		* * * * *
 * 		 * * * *
 * 		  * * *
 * 		   * *
 * 		    *
 *  */

package shitalSDec19.patternPrintingAssignment;

public class Solution5 {

	void printPattern(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (j>i)
					System.out.print(" ");
				else
					System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int n = 5;
		Solution5 solution5 = new Solution5();
		solution5.printPattern(n);
	}

}
