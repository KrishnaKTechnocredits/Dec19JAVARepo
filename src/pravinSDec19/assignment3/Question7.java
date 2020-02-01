package pravinSDec19.assignment3;
/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 7
 * 
	WAP to find Factorial series for user defined number
	a. Input number :- 5
	b. Output :- 120
 * 
 * 
 */

import java.util.Scanner;

public class Question7 {

	// displayFactorialNumber method is used to find Factorial series for user
	// defined number

	void displayFactorialNumber(int num) {

		int factNum = 1;

		for (int i = 1; i <= num; i++) {

			factNum = factNum * i;

		}

		System.out.println("Factorial series is: " + factNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question7 q7 = new Question7();
		System.out.println("Enter number to find factorial series");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		q7.displayFactorialNumber(num);

	}
}
