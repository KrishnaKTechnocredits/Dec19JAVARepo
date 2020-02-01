package pravinSDec19.assignment3;

/*
 * Created by : Pravin Sarda
 * Assignment 3 : Question 4
	WAP to find sum of user given number.
	a. Input:- 159753
	b. Sum of given number:- 30
 * 
 * 
 * 
 */
public class Question4 {

	// findSum method is used to sum of user given number.
	static void findSum(int num) {

		int sum = 0;
		int temp = 0;

		while (num != 0) {

			temp = num % 10;

			sum = sum + temp;

			num = num / 10;

		}

		System.out.println("Sum of given number is " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 159753;
		findSum(num);

	}
}