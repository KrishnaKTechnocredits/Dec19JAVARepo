/*
 * 4) WAP to find sum of user given number. a. Input:- 159753 b. Sum of given number:- 30 
 
 */
package krantikhair.assignment3;

import java.util.Scanner;

public class Question4 {

	void Display(int number) {
		int Reminder;
		int Sum = 0;
		for (Sum = 0; number > 0; number = number / 10) {
			Reminder = number % 10;
			Sum = Sum + Reminder;
		}
		System.out.println("The addition of digits is " + Sum);

	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		Question4 a = new Question4();
		a.Display(number);

	}

}
