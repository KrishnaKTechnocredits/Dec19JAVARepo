package poojaRDec19.Assignment3;

//3) WAP to find frequency of user defined character in user defined String a. i.e. User String :- “electrical engineering” b. i.e. User Char:- ‘e’ c. count of e :- 5 

import java.util.*;
public class Q3 
{int c;
	void frequency()
	{
		System.out.println("Enter String  : ");
		Scanner s=new Scanner(System.in);
		String g=s.nextLine();
		System.out.println("Enter character : ");
		Scanner s1=new Scanner(System.in);
		 char g1=s1.next().charAt(0);
		
		for(int i=0;i<g.length();i++)
		{
			if(g1==g.charAt(i))
			{
				 c++;
			}
		}
		System.out.println(c);
		
	}

	public static void main(String[] args)
	{
		Q3 q3=new Q3();
		q3.frequency();

	}

}
