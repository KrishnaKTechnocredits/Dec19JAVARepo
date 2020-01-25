package surajSDec19.Assignment2;

/*
 * 3) Check if array contains a number in Java?
 *Hint: Your method should accept 2 parameters. Input array and number.
 *i/p :- arr[] = {2,5,9,7,4,6}
 *number :- 8
 *o/p :- number is not in arr.
 *
 *Author: Suraj Shinde

*/

public class Question_3 {

	public void arrayContainsNum(int arr[], int n) {
		boolean flag = false; // boolean flag is set
		for (int i = 0; i < arr.length; i++) // for loop to iterate for array length
		{
			if (arr[i] == n) // if array value is same as integer number given
			{
				flag = true; // set flag to true
			}
		}
		if (flag == true) // if flag is true
		{
			System.out.println(n + ":is present in array"); // given integer is present in array
		} else {
			System.out.println(n + ":is NOT present in array"); // else given integer is not present when flag is set to
																// false
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 7, 4, 6 }; // Array input with 8 is not present in array
		Question_3 question_3 = new Question_3(); // object created for class Question_3
		question_3.arrayContainsNum(arr, 8); // arrayContainsNum method called with array input and number to verify in
												// array
	}

}
