/*  WAP to find unique number from given array store that numbers in new array.
a. firstArray:- {1,2,3,4,2,5} 
b. secondArray:- {5,6,7,8,9,7} 
c. unique array = {1,2,3,4,5,6,7,8,9} 
i. order can be anything  */

package shitalSDec19.assignment3;

public class Solution14_Alternate {

	int uniqueNumber[] = new int[10];

	void addUniqueNumberToArray(int number) {
		uniqueNumber[number] = number;
	}

	void printArray() {
		for (int i = 1; i < uniqueNumber.length; i++) {
			System.out.println(uniqueNumber[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 2, 5 };
		int[] arr2 = { 5, 6, 7, 8, 9, 7 };
		Solution14_Alternate solution14_Alternate = new Solution14_Alternate();
		for (int i = 0; i < arr1.length; i++) {
			solution14_Alternate.addUniqueNumberToArray(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			solution14_Alternate.addUniqueNumberToArray(arr2[i]);
		}
		solution14_Alternate.printArray();
	}
}

