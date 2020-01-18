/*
 * WAP to find Factorial series for user defined number
a. Input number :- 5
b. Output :- 120
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class Factorial {
	
	int calcFactorial(int num)
	{
		int fact=1;
		for (int i=5; i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial :");
		int num = scan.nextInt();
		int factorial = fact.calcFactorial(num);
		System.out.println("Factorial of "+num+ " is "+ factorial);
		scan.close();
	}
}
