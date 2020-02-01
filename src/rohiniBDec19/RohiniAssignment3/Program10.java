package rohiniBDec19.RohiniAssignment3;

/*10) WAP to sum of two array a. firstArray :- {1, 5, 9, 3, 7} b. secondAraay:- {1, 7,  9, 3} c. output :- 45 */

public class Program10 {

	static int sumOffArr1 = 0;
	static int sumOffArr2 = 0;

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 9, 3, 7 };
		int[] arr2 = { 1, 7, 9, 3 };
		System.out.print("Sum of two array is: ");
		System.out.println(findSumArr1(arr1) + findSumArr2(arr2));

	}

	static int findSumArr2(int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			sumOffArr2 = sumOffArr2 + arr2[i];
		}
		return sumOffArr2;
	}

	static int findSumArr1(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			sumOffArr1 = sumOffArr1 + arr1[i];
		}
		return sumOffArr1;
	}
}
