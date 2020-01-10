package surajSDec19.Assignments1;
/*Write a program to print the sum of all the elements of an array of size 4.
 * 
 * Author: Suraj Shinde
 * */
public class Question_2 {
	void sum(int arr[]) {
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {

			sum = sum + arr[i];
		}
		System.out.println("Sum of all the elements of an Array of size 4 is : " + sum);
	}

	public static void main(String[] args) {
		int arr[] = { 20, 10, 40, 30 };
		Question_2 question_2 = new Question_2();
		question_2.sum(arr);

	}

}
