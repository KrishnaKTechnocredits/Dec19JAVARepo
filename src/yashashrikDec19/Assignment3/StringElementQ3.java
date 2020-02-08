package yashashrikDec19.Assignment3;
/*3) WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. i.e. User Char:- ‘e’
c. count of e :- 5
*/

import java.util.Scanner;

public class StringElementQ3 {
	
	void findOccurrence(String name,char ch)
	{
		int cnt=0;
		for(int i=0;i<name.length();i++)
		{
			if(ch==name.charAt(i))
			{
				cnt++;
			}

		}
		System.out.println("Occurrence of e: " +cnt);
	}
	public static void main(String[] args) {
		StringElementQ3 q3=new StringElementQ3();
		String s;
		System.out.println("Enter String to find occurance of character");
		Scanner s1=new Scanner(System.in);
		s=s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		 System.out.println("Enter a character: ");
		 char c = s2.next().charAt(0);
		 System.out.println("You have entered: "+c);
		 q3.findOccurrence(s, c);
	}

}
