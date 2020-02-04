package praveenReddyDec2019.assignment2;

/*
 Find max value at differed index 
 i/p:- 
 arr1: {10,2,9,14,3}
 arr2: {10,2,18,14,3} 
 
o/p :-    Values are not matching at index -> 2              
         From (9,18) max value is 18 
 */

public class MaxAtDiffIndex_Q10 {
	static void MaxValue(int a[], int b[]) {
		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i]) {
				// int value1 = a[i];
				// int value2 = b[i];
				if (a[i] > b[i]) {
					System.out.println("max value from index:" + i + " is ->" + a[i]);
				} else {
					System.out.println("max value from index:" + i + " is ->" + b[i]);
				}

			}
	}

	public static void main(String[] args) {
		int a[] = { 100, 2, 18, 88, 3 };
		int b[] = { 100, 2, 18, 28, 30 };
		MaxAtDiffIndex_Q10.MaxValue(a, b);
		// Assignment2.MaxAtDiffIndex(a,b);
	}

}
