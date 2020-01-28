/*
 * 1.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class ArithmaticOperations {
	void sum(int a, int b)
	{
		System.out.println("Addition is : "+ (a+b));
	}
	void multiply(int a, int b)
	{
		System.out.println("Multiplication is : "+ a*b);
	}
	void substract(int a, int b)
	{
		if (a>b)
			System.out.println("Substraction is : "+(a-b));
		else
			System.out.println("Substraction is : "+(b-a));
	}
	void divide(int a, int b)
	{
		if(a>0 && b>0)
		{
			if(a>b)
				System.out.println("Division is : "+a/b);
			else
				System.out.println("Division is : "+b/a);
		}
		else
			System.out.println("Division is not possible");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=Integer.parseInt(scan.nextLine());
		System.out.println("Enter a another number : ");
		int b=Integer.parseInt(scan.nextLine());
		ArithmaticOperations ao = new ArithmaticOperations();
		ao.sum(a, b);
		ao.substract(a, b);
		ao.multiply(a, b);
		ao.divide(a, b);
		scan.close();
	}
}
