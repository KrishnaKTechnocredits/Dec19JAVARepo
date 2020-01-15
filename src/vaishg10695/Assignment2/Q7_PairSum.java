/*7) Find all pairs on integer array whose sum is equal to given number? 
 * Input:2, 4, 3, 5, 7, 8, 9 
 * Given sum:7 
 * Integer numbers, whose sum is equal to value:7 (2, 5)  (4, 3)  */
package vaishg10695.Assignment2;

public class Q7_PairSum {
	boolean flag = true;

	void sumOfElement(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					flag = false;
					System.out.println("pair having sum is: " + n + " is:" + "(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
		if (flag)
			System.out.println("Not a pair having sum of given number");
	}

	public static void main(String[] args) {
		Q7_PairSum prgm = new Q7_PairSum();
		int arr[] = { 4, 2, 3, 3, 50 };
		int number = 6;
		prgm.sumOfElement(arr, number);

	}

}
