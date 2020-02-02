/*
 * 5.	Find greater of two numbers using ternaryoperator
 */
package anjaliSDec19.Assignment4.DecisionMaking;

import java.util.Scanner;

public class GreaterOf2 {
	void greaterOf(int a, int b)
	{
		if(a==b)
			System.out.println("Both entered numbers are same");
		else
		{
			int c=0;
			if(a>c)
				c=a;
			if(b>c)
				c=b;
			System.out.println("Greater of entered 2 numbers is : "+c);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Enter a Number : ");
		int b = Integer.parseInt(scan.nextLine());
		GreaterOf2 obj = new GreaterOf2();
		obj.greaterOf(a,b);				
		scan.close();
	}
}
