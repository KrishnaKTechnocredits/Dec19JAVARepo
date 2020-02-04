/*
 * 9.	WAP to swap two numbers without using the thirdvariable.
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class Swapwithoutthirdvar {
	void swapp(int a, int b)
	{
		if(a>b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		else
		{
			b=a+b;
			a=b-a;
			b=b-a;
		}
		
		System.out.println("After Swap"+'\n'+"A = "+a+'\t'+"B = "+b);
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = scan.nextInt();
		System.out.println("Before Swap"+'\n'+"A = "+a+'\t'+"B = "+b);
		Swapwithoutthirdvar s = new Swapwithoutthirdvar();
		s.swapp(a, b);
		scan.close();		
	}
}
