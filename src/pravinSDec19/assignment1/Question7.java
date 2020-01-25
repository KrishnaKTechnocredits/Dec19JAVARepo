package pravinSDec19.assignment1;

/*
 * Created By: Pravin Sarda
 * Assignment 1 - Question 7
	You are given two numbers N and M, print the absolute difference between two numbers i.e.
	Approach:
	Therefore, if the value is negative, then make it positive by multiplying it with -1. Print out the value of result.
 * 
 */

public class Question7 {

	int differ(int N, int M) {

		int difference = N - M;

		if (difference < 0) {

			difference = difference * -1;

		}

		return difference;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question7 d = new Question7();

		System.out.println("Absolute difference between two numbers is " + d.differ(15, 12));

	}

}
