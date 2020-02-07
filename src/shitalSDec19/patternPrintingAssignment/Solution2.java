//2) Draw below pattern

// *
// **
// ***
// ****
// *****

package shitalSDec19.patternPrintingAssignment;

public class Solution2 {

	void printPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		Solution2 solution2 = new Solution2();
		solution2.printPattern(n);
	}

}
