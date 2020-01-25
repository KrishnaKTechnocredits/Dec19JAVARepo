package surajSDec19.Assignment2;

/*2) Find duplicate number on Integer array in Java?
 * Hint: There is exactly one number is repeated in the array. You need to write a program to
 * find that duplicate number. For example, if an array with length 6 contains numbers {0, 3,
 * 1, 2, 3}, then duplicated number is 3.
 * 
 * Author: Suraj Shinde
*/

public class Question_2 {

	public void repeatedNum(int arr[]) {
		for (int i = 0; i < arr.length; i++) { // for loop to iterate for array length
			for (int j = i + 1; j < arr.length; j++) { // for loop to iterate for array length but start for next index
				if (arr[i] == arr[j]) { // if both value at index is same
					System.out.println("Repeated numbers is: " + arr[j]); // print the same value for index
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 3, 4, 3, 3 }; // Array input with repeated number 3
		Question_2 question_2 = new Question_2(); // object created for class Question_2
		question_2.repeatedNum(arr); // repeatedNum method is called with input array parameter
	}

}
