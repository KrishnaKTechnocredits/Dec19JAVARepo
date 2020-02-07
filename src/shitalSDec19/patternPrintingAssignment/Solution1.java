//1) Draw below pattern
//    *
//   * *
//  * * *
// * * * *
//* * * * *

package shitalSDec19.patternPrintingAssignment;

public class Solution1 {

	void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j>i)
					System.out.print(" ");
				else 
					System.out.print(" *");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int n = 5;
		Solution1 solution1 = new Solution1();
		solution1.printPattern(n);
	}

}
