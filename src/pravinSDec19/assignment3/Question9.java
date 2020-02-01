package pravinSDec19.assignment3;
/*
 * Created By : Pravin Sarda
 * Assignment 3 : Question 9
 * 
	WAP to find average of user given array
	a. Input :- {14, 32, 19, 14, 78,36}
	b. Output:- 32.16
 * 
 * 
 */

import java.util.Scanner;

public class Question9 {

	// avgOfAllNumbersInGivenArray method is used find average of user given array

	void avgOfAllNumbersInGivenArray(int[] numArray) {

		double avg = 0.0;
		double sum = 0.0;

		for (int i = 0; i < numArray.length; i++) {

			sum = sum + numArray[i];

		}
		avg = (sum / numArray.length);

		System.out.println("Average of user given array is: " + avg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question9 q9 = new Question9();
		int num = 0;
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter how many number need to add into number array ");
		num = scn.nextInt();

		int[] numArray = new int[num];

		System.out.println("Enter the numbers to add into array: ");

		for (int i = 0; i < num; i++) {

			numArray[i] = scn.nextInt();

		}

		q9.avgOfAllNumbersInGivenArray(numArray);

	}
}
