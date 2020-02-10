// 5.	Find greater of two numbers using ternary operator

package shitalSDec19.assignment4_javaDecisionMakingPrograms;

public class Solution5 {
	Solution5(int a, int b) {
		findMaxNo(a, b);
	}
int max=0;
	void findMaxNo(int a, int b) {
		if (a > b? true : false)
			System.out.println("Max No is " + a);
		else
			System.out.println("Max No is " + b);

	}

	public static void main(String[] args) {
		Solution5 solution5 = new Solution5(-100, 20);

	}

}
