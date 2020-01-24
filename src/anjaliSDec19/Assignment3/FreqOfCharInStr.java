/*
 * WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. i.e. User Char:- ‘e’
c. count of e :- 5

 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class FreqOfCharInStr {
	Scanner scan = new Scanner(System.in);
	String getString()
	{
		System.out.println("Enter the String : ");
		String str = scan.next();
		//scan.close();
		return str;
	}
	char getChar()
	{
		System.out.println("Enter the Character : ");
		char ch = scan.next().charAt(0);
		//scan.close();
		return ch;
	}
	int freqOfChar (String str, char ch)
	{
		int cnt =0;
		for(int i=0; i<str.length(); i++)
		{
			if(ch== str.charAt(i))
				cnt++;
		}
		return cnt;
	}
public static void main(String[] args) {
	FreqOfCharInStr fr = new FreqOfCharInStr();
	String str = fr.getString();
	char ch = fr.getChar();
	int cnt = fr.freqOfChar(str,ch);
	System.out.println("Count of Char "+ch+" in String "+str+" is " + cnt );
}
}
