package surajSDec19.Assignment_3;
/*WAP which fulfill below condition
  a. WAP to find positive and negative number from the given array
  b. check the sum of individual.
 * 
 * Author: Suraj Shinde 
 * 
 * */

public class Question_1 {

	public static void findPositieNegative(int[] arr) {
		int positive = 0;
		int negative = 0;

		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				System.out.println("Positive Number: " + arr[i]);
				positive = positive + arr[i];

			} else {
				System.out.println("Negative Number: " + arr[i]);
				negative = negative + arr[i];
			}
		}

		System.out.println("Sum of positive numbers from array: " + positive);
		System.out.println("Sum of positive numbers from array: " + negative);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, -9, 14, -25, 6, 7, -14 };
		// Question_1 question_1=new Question_1();
		findPositieNegative(arr);
	}

}
