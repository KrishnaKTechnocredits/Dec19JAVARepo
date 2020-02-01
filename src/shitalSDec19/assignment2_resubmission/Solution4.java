/* Largest and smallest number in unsorted array? */

package shitalSDec19.assignment2_resubmission;

public class Solution4 {
	void largestNumber(int[] a) {
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (largest < a[i])
				largest = a[i];
		}
		System.out.println("The largest number is " + largest);
	}

	void smallestNumber(int[] a) {
		int smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (smallest > a[i])
				smallest = a[i];
		}
		System.out.println("The smallest number is " + smallest);
	}

	public static void main(String args[]) {
		int arr[] = { 2, 6, 3, 9, 11 };
		Solution4 solution4 = new Solution4();
		solution4.largestNumber(arr);
		solution4.smallestNumber(arr);

	}

}
