package surajSDec19.Assignments1;
/*Write a program to list all the integers between two integers start and end(including start
 * and end).
 *
 * Author: Suraj Shinde
 * */
public class Question_5 {

	public void displayListOfInteger(int start, int end) {
		for (int i = start; i <= end; i++) {

			System.out.println(i);

		}

	}

	public static void main(String[] args) {
		Question_5 question_5 = new Question_5();
		question_5.displayListOfInteger(5, 10);

	}
}