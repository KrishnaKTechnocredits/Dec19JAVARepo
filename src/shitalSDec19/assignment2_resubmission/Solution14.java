/*WAP to print even number from the array int a = {15, 24, 52, 49, 62, 10}; output :- {24, 52, 62, 10*/

package shitalSDec19.assignment2_resubmission;

public class Solution14 {
	void printEvenNos(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println("Even numbers are " + a[i]);
		}
	}

	public static void main(String args[]) {
		int[] array = { 15, 24, 52, 49, 62, 10 };
		Solution14 solution14 = new Solution14();
		solution14.printEvenNos(array);
	}
}
