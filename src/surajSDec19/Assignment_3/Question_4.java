package surajSDec19.Assignment_3;

import java.util.Scanner;

/*WAP to find sum of user given number.
 * 
 * Author: Suraj Shinde
 *  
 */
public class Question_4 {
	
	public void sumOfNumber(int number) {
		int sum = 0;
		int reminder;
		while (number > 0) {
			reminder = number % 10;
			sum = sum + reminder;
			number = number / 10;
		}
		System.out.println("Sum of the User Given Number is: " + sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		Question_4 question_4=new Question_4();
		question_4.sumOfNumber(number);
	}

}
