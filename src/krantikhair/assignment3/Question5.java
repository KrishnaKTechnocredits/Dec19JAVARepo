/*
 *  WAP to reveres user given number a. Input number:- 456789 b. Output number :- 987654 
 */
package krantikhair.assignment3;

import java.util.Scanner;

public class Question5 {

	void Display(int number) {
		int reverse;
		int reminder;
		for (reverse = 0; number > 0; number = number / 10) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
		}
		System.out.println("The reversed number is " + ":" + reverse);

	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		Question5 a = new Question5();
		a.Display(number);

	}

}
