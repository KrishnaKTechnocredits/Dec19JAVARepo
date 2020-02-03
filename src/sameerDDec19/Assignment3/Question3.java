package sameerDDec19.Assignment3;

import java.util.Scanner;
/*
 * WAP to find frequency of user defined character in user defined String
	a. i.e. User String :- “electrical engineering”
	b. i.e. User Char:- ‘e’
	c. count of e :- 5
 */
public class Question3
{
	static int count;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1=sc.nextLine();
		System.out.println("Enter the index you want to count frequency :");
		int i=sc.nextInt();
		char userCh=s1.charAt(i);
		charFrequency(userCh,s1);
		System.out.println(count);
	}
	static void charFrequency(char userCh,String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==userCh)
			{
				count++;
			}
		}
	}
}
