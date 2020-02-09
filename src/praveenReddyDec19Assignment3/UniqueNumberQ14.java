package praveenReddyDec19Assignment3;
/*
 WAP to find unique number from given array store that numbers in new array.  
 a. firstArray:- {1,2,3,4,2,5} 
 b. secondArray:- {5,6,7,8,9,7} 
 c. unique array = {1,2,3,4,5,6,7,8,9} 
 i. order can be anything 
 */

public class UniqueNumberQ14 {

	static void UniqueNumberFromArray(int array1[], int array2[]) {
		int[] outArray = new int[array1.length + array2.length];

		for (int i = 0; i < array1.length; i++) {
			boolean flag = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					flag = true;
				}
			}
			if (!flag) {
				outArray[i] = array1[i];
				System.out.println(outArray[i]);
			}
		}
		//for (int i = 0; i < outArray.length; i++) {
		//System.out.print(outArray[i]);
		//}
	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 2, 5 };
		int array2[] = { 5, 6, 7, 8, 9, 7 };
		UniqueNumberQ14.UniqueNumberFromArray(array1, array2);
	}

}
