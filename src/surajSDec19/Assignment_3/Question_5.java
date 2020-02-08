package surajSDec19.Assignment_3;

import java.util.Scanner;

/*WAP to reveres user given number
 * 
 * Author: Suraj Shinde
 *  
 */
public class Question_5 {

	public void sumOfNumber(int number) {

		int revNum = 0;
		while (number > 0) {
			revNum = revNum * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Sum of the User Given Number is: " + revNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		Question_5 question_5 = new Question_5();
		question_5.sumOfNumber(number);
	}

}
