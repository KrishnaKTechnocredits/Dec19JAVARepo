package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find sum of user given number.
	a. Input:- 159753
	b. Sum of given number:- 30
 */
public class Question4
{
	static int totalSum;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		String num=sc.next();
		sum(num);
		System.out.println("Total Sum is :"+totalSum);
	}
	static void sum(String num)
	{
		for(int i=0;i<num.length();i++)
		{
			Character c;//character define
			c=num.charAt(i);//String to char
			String s=c.toString();//char to String
			int n=Integer.parseInt(s);
			totalSum=totalSum+n;
		}
	}
}
