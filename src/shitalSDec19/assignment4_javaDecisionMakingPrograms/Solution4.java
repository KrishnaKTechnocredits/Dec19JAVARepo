/* 4.	Find whether a number is negative positive or zero */

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

public class Solution4 {
	Solution4(int n) {
		findPostiveNegativeNo(n);
	}

	void findPostiveNegativeNo(int no) {
		if (no > 0)
			System.out.println("Number " + no + " is Positive No");
		else
			System.out.println("Number " + no + " is Negative No");
	}

	public static void main(String[] args) {
		Solution4 solution4 = new Solution4(-3);
	}
}
