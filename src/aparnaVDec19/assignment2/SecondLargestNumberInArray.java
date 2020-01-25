package aparnaVDec19.assignment2;

/*
 * 5)Write a java program to find second largest element in an array of integers?
 */
public class SecondLargestNumberInArray {

	static void seconLargestNumberFind(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest number in Given Array is:- > " + secondLargest);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 6, 9, 11 };
		seconLargestNumberFind(arr);
	}

}
