package surajSDec19.Assignment_3;

import java.util.Scanner;

/*WAP to find frequency of user defined character in user defined String
   a. i.e. User String :- “electrical engineering”
   b. i.e. User Char:- ‘e’
   *
   *Author: Suraj Shinde
   */
public class Question_3 {
	
	public void freqOfChar(String str, char ch) {
		int freqOfCharCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch) {
				freqOfCharCount++;
			}
		}
		System.out.println("frequency of user defined character '"+ch+ "' in user defined String "+str+" is : "+freqOfCharCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in=new Scanner(System.in);
		//System.out.println("Enter the string: ");
		//String str=in.nextLine();
		
		String str="eeelectrical engineering";
		char ch='e';
		Question_3 question_3=new Question_3();
		question_3.freqOfChar(str, ch);
	}

}
