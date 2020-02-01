package vishwasCDec19.assignment3;
/*
 *  WAP to find vowels in given string 
 */

import java.util.Scanner;

public class Q8FindVowelsOfStr 
{
	static int count;
	static void display(String given) {
		for (int i = 0; i < given.length(); i++) 
		{
			if (given.charAt(i) == 'a')
			{
				count++;
			} else if (given.charAt(i) == 'e') 
			{
				count++;
			} else if (given.charAt(i) == 'i') 
			{
				count++;
			} else if (given.charAt(i) == 'o') 
			{
				count++;
			} else if (given.charAt(i) == 'u') 
			{
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String");
		String given = s.nextLine();
		display(given);
		System.out.println("Vowels count is :"+count);
	}

}
