/*
 * 2.	Find the largest of three numbers using Logical Andoperator.
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class MaxOfThree {

	void maxOf3(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.println("Max Of entered 3 numbers is : "+ a);
		else if(b>a && b>c)
			System.out.println("Max Of entered 3 numbers is : "+ b);
		else
			System.out.println("Max Of entered 3 numbers is : "+ c);
			
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Enter 2nd Number : ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println("Enter 3rd Number : ");
		int c = Integer.parseInt(scan.nextLine());
		MaxOfThree obj = new MaxOfThree();
		obj.maxOf3(a, b, c);
		scan.close();
	}
}
