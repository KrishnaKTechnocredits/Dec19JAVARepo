package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 * WAP to find sum of user given number.
	a. Input:- 159753
	b. Sum of given number:- 30
 */
public class Question4 {
	public static void main(String[] args) {
		Question4 que = new Question4();
		System.out.println("Enter the number you want to add : ");
		Scanner s = new Scanner(System.in); // input from console
		int input = s.nextInt();
		System.out.println("Sum of given number:- "+que.getSum(input));

	}

	int getSum(int input1) //function to get sum of digits 
	{
		int sum = 0;
		while (input1 != 0) {
			sum = sum + input1 % 10;
			input1 = input1 / 10;
		}
		return sum;
	}
}
