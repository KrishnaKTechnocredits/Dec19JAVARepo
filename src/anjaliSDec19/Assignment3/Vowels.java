/*
 * WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11

 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class Vowels {

	int countVowel(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Vowels v = new Vowels();
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter the string : ");
		String str = scan.nextLine();
		int count = v.countVowel(str);
		System.out.println("Count of vowel in the string is : "+ count);
		scan.close();
	}
}
