package dipaPDec19.Assingment3;

import java.util.Scanner;

/*
 * WAP to find frequency of user defined character in user defined String
 *  a. i.e. User String :- “electrical engineering”
	b. i.e. User Char:- ‘e’
	c. count of e :- 5
 */
public class Question3 {
	public static void main(String[] args) {
		Question3 que = new Question3();
		
		System.out.println("Enter the string : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); //reads string.
		
		System.out.println("Enter the character you want to count ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);  //reads character.
		System.out.println("Count of "+ch+" is "+que.getCharFrequency(str, ch));
	}

	int getCharFrequency(String str1, char ch1) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (ch1 == str1.charAt(i))
				count++;
		}
		return count;
	}

}
