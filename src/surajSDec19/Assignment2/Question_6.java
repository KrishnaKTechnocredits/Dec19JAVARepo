package surajSDec19.Assignment2;

/*Write a java program to check the equality of two arrays?
 *Hint: Input Arrays :
 *First Array : [21, 57, 11, 37, 24]
 *Second Array : [21, 57, 11, 37, 24]
 *Two Arrays Are Equal
 *
 *Author: Suraj Shinde
 **/
public class Question_6 {

	public void equalArray(int arr1[], int arr2[]) {
		boolean flag = true; // flag set to true
		for (int i = 0; i < arr1.length; i++) { // loop for array one to run upto full length
			for (int j = 0; j < arr2.length; j++) { // loop for array two to run upto full length
				if (i == j && flag == true) { // condition that index should be same and flag should be true
					if (arr1[i] == arr2[j]) { //condition that integer should be same value for i and j index
						flag = true;

					} else {
						flag = false;

					}
					// break;
				}
			}

		}
		if (flag == true) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not Equal");
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 6, 3, 9, 11 }; // Array input one
		int[] arr2 = { 2, 6, 4, 9, 11 }; // Array input two

		Question_6 question_6 = new Question_6(); // object created for class Question_6
		question_6.equalArray(arr1, arr2); //equalArray method called with array input

	}

}
