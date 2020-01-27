package poojaRDec19.Assignment3;
//7) WAP to find Factorial series for user defined number a. Input number :- 5 b. Output :- 120 

import java.util.*;
public class Q7
{
	int c=1;
	void factorial()
	{
		System.out.println("Enter no  : ");
		Scanner s=new Scanner(System.in);
		int g=s.nextInt();
		for(int i=g;i>0;i--)
		{
			c=c*i;
		}
		System.out.println("factorial = "+c);
	}
	public static void main(String[] args) 
	{
		Q7 q7=new Q7();
		q7.factorial();
	}

}
