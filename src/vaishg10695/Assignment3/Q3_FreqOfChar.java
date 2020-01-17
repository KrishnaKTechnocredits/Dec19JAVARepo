/* WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. i.e. User Char:- ‘e’
c. count of e :- 5*/

package vaishg10695.Assignment3;

import java.util.Scanner; 

public class Q3_FreqOfChar {
	
	
	void charCount(String s, char c )
	{
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))							
				cnt++;			
		}
		
		System.out.println("frequency of charactor "+ c+ " is "+ cnt);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		
		Q3_FreqOfChar foc=new Q3_FreqOfChar();

		for(int i=0;i<str.length();i++)												
		{
		   char ch=str.charAt(i);	//charAt returns charactor of secified index			
			int index=str.indexOf(ch);	//indexOf gives index of specified charactor	
			if(i==index)
				   foc.charCount(str, ch);
		}	
	}

}
