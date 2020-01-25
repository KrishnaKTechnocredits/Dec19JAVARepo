/*
 * 3) WAP to find frequency of user defined character in user defined String a. i.e. User String :- “electrical engineering” b. i.e. User Char:- ‘e’ c. count of e :- 5 
 
 */

package krantikhair.assignment3;
import java.util.Scanner;
public class Question3 {
	
	static void display(String a, char Letter)
	{
	int Cnt = 0;
	
	
		for(int i = 0;i < a.length();i++)
			
		{
			char ch = a.charAt(i);
			if (ch == Letter)
			{
				Cnt++;
			}
		}
		
	System.out.println(Cnt);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner s =new Scanner(System.in);
		String a = s.next();
		System.out.println("Enter the Letter");
		Scanner s1 =new Scanner(System.in);
		char Letter = s1.next().charAt(0);
		display(a,Letter);
		
		

	}


}
