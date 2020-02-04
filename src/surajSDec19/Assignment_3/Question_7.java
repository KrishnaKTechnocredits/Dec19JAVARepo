package surajSDec19.Assignment_3;

import java.util.Scanner;

/*
 * WAP to find Factorial series for user defined number
 * 
 * Author: Suraj Shinde
 *
 */
public class Question_7 {

	public void factorialNuber(int number) {
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Of given number Is: "+fact);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for which we need factorial: ");
		int number=sc.nextInt();
		Question_7 question_7=new Question_7();
		question_7.factorialNuber(number);
	}

}
