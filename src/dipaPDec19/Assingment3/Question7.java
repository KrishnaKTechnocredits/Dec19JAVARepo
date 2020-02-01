package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 * WAP to find Factorial series for user defined number
	a. Input number :- 5
	b. Output :- 120
 */
public class Question7 {
	public static void main(String[] args) {
		
		Question7 que7 = new Question7();
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
	
		que7.getFactorialNum(number);
	}
	
	void getFactorialNum(int num)
	{
		int fact = 1;
		for(int i =1; i<= num ;i++)
		{
			fact = fact *i;
		}
		System.out.println("The factorial number of "+num+" is "+fact);
	}
}
