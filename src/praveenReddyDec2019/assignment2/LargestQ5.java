package praveenReddyDec2019.assignment2;

//WAP to find second largest element in an array of integers ?

public class LargestQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 10, 2, 3, 9, 8 };
		int largestNum = arr[0];
		int secondLargeNum = arr[0];
		int temp[] = new int[4];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largestNum) {
				secondLargeNum = largestNum;
				largestNum = arr[i];
			} else if (arr[i] > secondLargeNum) {
				secondLargeNum = arr[i];
			}

		}
		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
		}
		System.out.println("largest Num = " + largestNum + " Second Largest Num = " + secondLargeNum);
	}
}