package surajSDec19.Assignment2;

/*
 * 7) Find all pairs on integer array whose sum is equal to given number?
 * 
 * Author: Suraj Shinde
 * 
*/
public class Question_7 {

	public void twoIntergerArraySum(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) { // loop for array one to run upto full length and start from zero index
			for (int j = i + 1; j < arr.length; j++) {// loop for array one to run upto full length and start from first index

				if (arr[i] + arr[j] == n) {
					System.out.println("Integer number whose sum is equal to given value "+n+" :"+"{"+arr[i]+" "+arr[j]+"}");
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,5,7,8,9}; // Array input 
		Question_7 question_7 = new Question_7(); // object created for class Question_7
		question_7.twoIntergerArraySum(arr, 7); // twoIntergerArraySum method called with array input and sum number 7
	}

}
