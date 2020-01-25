package swatiShinde30.assignment3;
/*
 *Largest and smallest number in unsorted array?  
 */
public class Assign2Question4 {

	static void largestNum(int[] arr) {
		int large = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large)
				large = arr[i];
		}
		System.out.println("largest num is " + large);
	}

	static void smallestNum(int[] arr) {
		int i = 0;
		int small = arr[i];
		for (i = 0; i < arr.length; i++) {
			if (small > arr[i])
				small = arr[i];
		}
		System.out.println("smallest num is " + small);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 1, 16 };
		largestNum(arr);
		smallestNum(arr);
	}

}
