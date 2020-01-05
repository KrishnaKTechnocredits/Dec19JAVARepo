package assignment1;

import java.util.Scanner;

public class SumOfTwoIntegers {
	
	public static int sum(int a, int b)
	{
		return (a+b);
	}
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter first number for addition: ");
	 int a = sc.nextInt();
	 System.out.println("Enter second number for addition: ");
	 int b = sc.nextInt();
	 System.out.println("Sum : " + sum(a,b));
	 sc.close();
	}

}
