/*
 * 8.	WAP to swap two numbers using the thirdvariable
 */
package anjaliSDec19.Assignment4.JavaBasicsProgram;

import java.util.Scanner;

public class Swappusing3rdvar {
	void swapp(int a,int b)
	{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap"+'\n'+"A = "+a+'\t'+"B = "+b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = scan.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = scan.nextInt();
		System.out.println("Before Swap"+'\n'+"A = "+a+'\t'+"B = "+b);
		Swappusing3rdvar s = new Swappusing3rdvar();
		s.swapp(a, b);
		scan.close();		
	}
}
