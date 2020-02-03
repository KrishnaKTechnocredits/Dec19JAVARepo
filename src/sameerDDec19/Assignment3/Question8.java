package sameerDDec19.Assignment3;

import java.util.Scanner;
/*WAP to find vowels in given string
	a. Input :- automation engineering
	b. Count :- 11 
 */
public class Question8
{
	static int count;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		display(str);
		System.out.println("The total vowels in given string is "+count);
	}
	static void display(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
			else if(str.charAt(i)=='e')
			{
				count++;
			}
			else if(str.charAt(i)=='i')
			{
				count++;
			}
			else if(str.charAt(i)=='o')
			{
				count++;
			}
			else if(str.charAt(i)=='u')
			{
				count++;
			}
		}
	}
}
